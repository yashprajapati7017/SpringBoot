package com.springboot.exceptionhandling.Service;
import com.springboot.exceptionhandling.Dao.EmployessDao;
import com.springboot.exceptionhandling.Entityes.Employes;
import com.springboot.exceptionhandling.GlobalException.Duplicate;
import com.springboot.exceptionhandling.GlobalException.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Service1 {

    @Autowired
    EmployessDao employessDao;

    public Iterable<Employes> getEmployess() {
        Iterable<Employes> list= employessDao.findAll();
        return list;
    }

    public Employes getById(int id) {
        Employes responce= employessDao.findById(id).orElseThrow(()-> new NotFoundException("Employee with id " + id + " not found"));
        return responce;
    }

    public Employes saveEmployes(Employes employes) {
        String work=employes.getWork();
        if(checkWork(work)) {
            throw new Duplicate("Work already exists"+employes.getWork());
        }

        return employessDao.save(employes);
    }

    public void  deleteEmployes(int id) {

        employessDao.findById(id).orElseThrow(()-> new NotFoundException("Employee with id " + id + " not found"));

        employessDao.deleteById(id);
    }

    public Employes updateEmployes(Employes employes,  int id) {

        employessDao.findById(id).orElseThrow(()-> new NotFoundException("Employee with id " + id + " not found"));
        employes.setEmployeid(id);

        return employessDao.save(employes);
    }

    private boolean checkWork(String work) {

        return employessDao.existsByWork(work);

    }

}

