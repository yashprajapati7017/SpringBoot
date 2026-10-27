package com.springboot.customtag.DaoService;

import com.springboot.customtag.UserServish.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<Client, Integer> {

    public List<Client> findByName(String name);
    public List<Client> findByEmailAndName(String email,String name);


}
