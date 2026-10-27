package com.springboot.springjpa;

import com.springboot.springjpa.Dao.UserRepository;
import com.springboot.springjpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {


   public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(SpringJpaApplication.class, args);

       UserRepository userRepository= context.getBean(UserRepository.class);


//       inserdata

//       User user1=new User();
//       user1.setFirstName("yash");
//       user1.setLastName("prajapati");
//       user1.setEmail("yash@email.com");
//       user1.setPassword("2525");
//

       //when insert only one user
//        userRepository.save(user1);

//
//       User user2=new User();
//       user2.setFirstName("kunal");
//       user2.setLastName("kumar");
//       user2.setEmail("kunal@email.com");
//       user2.setPassword("1111");
//
//
//       User user3=new User();
//       user3.setFirstName("ayan");
//       user3.setLastName("sani");
//       user3.setEmail("ayan@email.com");
//       user3.setPassword("0101");
//
//       List<User> list= List.of(user1,user2,user3);
//
//        Iterable<User>result=userRepository.saveAll(list);
//
//         result.forEach(e->{
//            System.out.println(e);
//         });


//       get single user
//       Optional<User>user =userRepository.findById(1);
//      System.out.println(user);


//      get multiple user
      Iterable<User> user= userRepository.findAll();
      user.forEach(e->System.out.println(e));


//      update user
//      Optional<User> optional=userRepository.findById(1);
//      User user=optional.get();
//      user.setLastName("yadhav");
//      userRepository.save(user);
//      System.out.println(user);

//      userRepository.deleteById(1);
//      System.out.println("Deleted User");

    }

}
