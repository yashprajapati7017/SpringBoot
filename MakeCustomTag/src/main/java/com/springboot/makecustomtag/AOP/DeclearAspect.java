package com.springboot.makecustomtag.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DeclearAspect {

//    check working

//    @Before("within(com.springboot.makecustomtag.ServiceHandling.StudentService)")
//    public void BeforeMethod(){
//        System.out.println("Before Method");
//    }

    @Around("@annotation(com.springboot.makecustomtag.MakeAnnotation.TrackExecution)")
    public Object BeforeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before method");

        long startTime = System.currentTimeMillis();

        try{
            return  joinPoint.proceed();
        }finally {
            System.out.println("After method");
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;

            System.out.println("Time duration :-> "+duration + " of Method is :-> "+
                    joinPoint.getSignature().getName());

        }



    }


}
