package com.springboot.wrapperaop.Wrapper;

import com.springboot.wrapperaop.Entity.Student;
import com.springboot.wrapperaop.Inferlogic.Logic;
import com.springboot.wrapperaop.ServiceHandling.StudentImp;
import com.springboot.wrapperaop.StudentStructure.MainStudent;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WrapperImp implements MainStudent {

    StudentImp studentImpt;

    public WrapperImp(StudentImp studentImpt){
        this.studentImpt = studentImpt;
    }

    @Override
    public void create(Student student) {
        Logic.enter("MainController", "create");
        studentImpt.create(student);
        Logic.exit("MainController", "create");
    }
}
