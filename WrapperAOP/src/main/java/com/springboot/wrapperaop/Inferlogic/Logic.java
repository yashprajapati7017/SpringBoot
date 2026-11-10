package com.springboot.wrapperaop.Inferlogic;

import org.springframework.stereotype.Component;

@Component
public class Logic {

   public static void enter(String className, String methodName){

        System.out.println("Class Name : " + className);
        System.out.println("Method Name : " + methodName);

    }

    public  static void exit(String className, String methodName){
        System.out.println("Class Name : " + className);
        System.out.println("Method Name : " + methodName);
    }

}
