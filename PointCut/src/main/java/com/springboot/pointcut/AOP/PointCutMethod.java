package com.springboot.pointcut.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointCutMethod {

//    @Before("execution (* com.springboot.pointcut..*(*) )")
//    public void BeforeMethod() {
//        System.out.println("Before Method");
//    }

//    @Before("within(com.springboot.pointcut.Service..*)")
//    public void BeforeMethod() {
//        System.out.println("Before Method");
//    }

    @Before("Bean(dummyService (..))")
    public void BeforeMethod() {
        System.out.println("Before Method");
    }

}
