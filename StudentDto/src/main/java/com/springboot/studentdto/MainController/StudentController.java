package com.springboot.studentdto.MainController;

import com.springboot.studentdto.EntityStudent.Student;
import com.springboot.studentdto.Service.ServiceStudent;
import com.springboot.studentdto.StudentEntityDto.StudentResponceDTO;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private ServiceStudent serviceStudent;

    @Autowired
    public StudentController(ServiceStudent serviceStudent) {
        this.serviceStudent = serviceStudent;
    }

    @PostMapping("/student")
    public ResponseEntity<StudentResponceDTO> CreateStudent( @Valid @RequestBody StudentResponceDTO studentResponceDTO) {
        StudentResponceDTO studentResponce=serviceStudent.CreateStudent(studentResponceDTO);
        if(studentResponce==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(studentResponce);
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>>GetAllStudents(){
         List<Student> responceStudent= serviceStudent.GetStudent();

         if(responceStudent==null){
             return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
         }
         return ResponseEntity.status(HttpStatus.FOUND).body(responceStudent);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getById(@PathVariable Integer id){
        Student responceStudent=serviceStudent.getId(id);
        if(responceStudent==null){
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(responceStudent);
    }
    @PutMapping("/student/{id}")
    public ResponseEntity<StudentResponceDTO> Update( @Valid @PathVariable Integer id, @RequestBody StudentResponceDTO studentResponceDTO){

        StudentResponceDTO responceStudent= serviceStudent.UpdateStudent(id,studentResponceDTO);

        if(responceStudent==null){
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(responceStudent);
    }

    @DeleteMapping("/student/{id}")
    public String Delete(@PathVariable Integer id){

        if(serviceStudent.patch(id)){
            return "Student delete";
        }
        return "Not Founds";

    }

}
