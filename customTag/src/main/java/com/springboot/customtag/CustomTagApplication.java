package com.springboot.customtag;

import com.springboot.customtag.DaoService.UserRepository;
import com.springboot.customtag.UserServish.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class CustomTagApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(CustomTagApplication.class, args);

      UserRepository userRepository= context.getBean(UserRepository.class);

//        Client client=new Client();
//        client.setName("Ankit");
//        client.setEmail("An84599@gmail.com");
//        client.setPassword("1010");
//        client.setRole("phyton");
//
//        userRepository.save(client);
//        System.out.println(client);

//        List<Client> list= userRepository.findByName("yash");
//        list.forEach(System.out::println);

//         List<Client> list= userRepository.findByEmailAndName("yp84599@gmail.com","yash");
//         list.forEach(System.out::println);

    }
}
