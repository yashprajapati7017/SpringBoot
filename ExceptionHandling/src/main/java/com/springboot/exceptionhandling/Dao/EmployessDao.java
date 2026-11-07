package com.springboot.exceptionhandling.Dao;

import com.springboot.exceptionhandling.Entityes.Employes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployessDao extends CrudRepository<Employes, Integer> {

    boolean existsByWork(String work);

}

