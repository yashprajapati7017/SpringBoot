package com.springboot.studentdto.Service;

import com.springboot.studentdto.EntityStudent.Student;
import com.springboot.studentdto.Repo.StudentRepo;
import com.springboot.studentdto.StudentEntityDto.StudentResponceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceStudent {

    private StudentRepo studentRepo;

    @Autowired
    public ServiceStudent(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public StudentResponceDTO CreateStudent(StudentResponceDTO studentResponceDTO) {
        Student student=MapToEntity(studentResponceDTO);
        student.setCreated(LocalDateTime.now());
        studentRepo.save(student);
        return MapToResponce(student);


    }

    public List<Student> GetStudent(){
        List<Student>resStudent = studentRepo.findAllByDeletedIsFalse();

        return resStudent;
    }

    public StudentResponceDTO getId(Integer id){
        Student resStudent= studentRepo.findByIdAndDeletedIsFalse(id);
        return MapToResponce(resStudent);
    }

    public StudentResponceDTO UpdateStudent(Integer id, StudentResponceDTO studentResponceDTO){

        Student student= studentRepo.findByIdAndDeletedIsFalse(id);
        Student student0= MapToEntityUpdate(student,studentResponceDTO);
        Student resStudent= studentRepo.save(student);
        StudentResponceDTO responceDTO= MapToResponce(resStudent);
        return responceDTO;

    }

    public boolean patch(Integer id){
         Student student= studentRepo.findByIdAndDeletedIsFalse(id);

         if(student==null){
             return false;
         }
         student.setDeleted(true);
         studentRepo.save(student);
         return true;

    }

    private Student MapToEntity(StudentResponceDTO studentResponceDTO){
        Student student=new Student();
        student.setName(studentResponceDTO.getName());
        student.setAge(studentResponceDTO.getAge());
        student.setEmail(studentResponceDTO.getEmail());
        student.setSubject(studentResponceDTO.getSubject());
        student.setUpdated(LocalDateTime.now());
        return student;
    }

    private StudentResponceDTO MapToResponce(Student student){
        StudentResponceDTO studentResponceDTO=new StudentResponceDTO();
        studentResponceDTO.setId(student.getId());
        studentResponceDTO.setName(student.getName());
        studentResponceDTO.setAge(student.getAge());
        studentResponceDTO.setEmail(student.getEmail());
        studentResponceDTO.setSubject(student.getSubject());
        return studentResponceDTO;
    }

    private Student MapToEntityUpdate(Student student, StudentResponceDTO studentResponceDTO){

        student.setName(studentResponceDTO.getName());
        student.setAge(studentResponceDTO.getAge());
        student.setEmail(studentResponceDTO.getEmail());
        student.setSubject(studentResponceDTO.getSubject());
        student.setUpdated(LocalDateTime.now());
        return student;
    }

}
