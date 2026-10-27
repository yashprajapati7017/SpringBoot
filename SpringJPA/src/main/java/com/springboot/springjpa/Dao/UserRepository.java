package com.springboot.springjpa.Dao;

import com.springboot.springjpa.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {


}
