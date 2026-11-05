package com.springboot.studentdto.Repo;

import com.springboot.studentdto.EntityStudent.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {

    List<Student> findAllByDeletedIsFalse ();
    Student findByIdAndDeletedIsFalse(Integer id);

}
