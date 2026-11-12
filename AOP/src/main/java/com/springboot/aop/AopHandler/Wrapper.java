package com.springboot.aop.AopHandler;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Wrapper {

//    @Before("execution(String com.springboot.aop.ServiceHandling.StudentService.create())")
//    public void BeforeMethod() {
//        System.out.println("before");
//    }
//
//    @After("execution(String com.springboot.aop.ServiceHandling.StudentService.create())")
//    public void AfterMethod() {
//        System.out.println("after");
//    }
//
//    @AfterReturning("execution(String com.springboot.aop.ServiceHandling.StudentService.create())")
//    public void AfterReturning() {
//        System.out.println("afterReturning");
//    }
//
//    @AfterThrowing("execution(String com.springboot.aop.ServiceHandling.StudentService.create())")
//    public void AfterThrowing() {
//        System.out.println("afterThrowing");
//    }

    @Around(value="execution(* com.springboot.aop.ServiceHandling.StudentService.create(..))")
    public void AroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before Method");
         joinPoint.proceed();
        System.out.println("After Method");

    }

}
