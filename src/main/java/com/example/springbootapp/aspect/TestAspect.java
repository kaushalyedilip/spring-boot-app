package com.example.springbootapp.aspect;

import com.example.springbootapp.service.TestService;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;

@Aspect
//@Component
//@Configurable
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class TestAspect {

    Logger LOGGER = LoggerFactory.getLogger(TestAspect.class);

    @Autowired
    private TestService testService;

    public TestAspect(){
        LOGGER.info("+++++TestAspect Default Constructor+++++++++");
    }

//    public TestAspect(TestService testService){
//        LOGGER.info("++++++++++TestAspect Contructor Called++++");
//        this.testService = testService;
//    }

    @Around("execution(* com.example.springbootapp.service.impl.TestServiceImpl.m2())")
    public Object test(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("++++++++TestAspect.test() called++++++");
        LOGGER.info("++++test Service: {}", testService);
        testService.m2();
        Object obj = proceedingJoinPoint.proceed();
        LOGGER.info("++++++++TestAspect.test() completed++++++");
        return obj;
    }

    @Around("execution(* com.example.springbootapp.service.impl.TestServiceImpl.m1(..))")
    public Object test2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("++++++++TestAspect.test() called++++++");
        //testService.m2();
        Object obj = proceedingJoinPoint.proceed();
        LOGGER.info("++++++++TestAspect.test() completed++++++");
        return obj;
    }

    //@Around("execution(* com.example.springbootapp.service.impl.S3ClientService.putObject(..))")
   // @Around("within(software.amazon.awssdk.services.s3.S3Client+) && execution(* putObject(..))")
    //@Around("execution(* software.amazon.awssdk.services.s3.DefaultS3Client.*(..))")
    public Object putObjectAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object[] args = proceedingJoinPoint.getArgs();
        Object obj = args[0];

        try {
            Field field = obj.getClass().getDeclaredField("bucket");
            field.setAccessible(true);
            String value = field.get(obj).toString();
            LOGGER.info("+++++++++++++++Bucket Name++++++++++++{}", value);
        } catch (Exception e) {
            LOGGER.error("Bucket not exist");
        }


        LOGGER.info("++++++++++executing S3Client.putObject method++++++++++");
        Object object = proceedingJoinPoint.proceed();
        LOGGER.info("After completion");
        return object;
    }

    @Around("execution(* java.lang.String.toString())")
    public Object toString(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("++++++++++ToSting Advice called++++++");
        return proceedingJoinPoint.proceed();
    }


//    @Around("execution(* com.example.springbootapp.service.impl.S3ClientServiceImpl.putObject(software.amazon.awssdk.services.s3.model.PutObjectRequest,"
//            + "software.amazon.awssdk.core.sync.RequestBody))")
    //@Around("execution(* com.example.springbootapp.service.impl.S3ClientService.putObject(..))")
    public Object putObject(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("++++++++S3ClientServiceImpl.putObject() called++++++");
        Object object = proceedingJoinPoint.proceed();
        LOGGER.info("++++++++S3ClientServiceImpl.putObject() completed++++++");
        return object;
    }

//    @Around("execution(* software.amazon.awssdk.services.s3.S3Client.*(..))")
//    public void putObjectAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        LOGGER.info("++++++++++executing S3Client.putObject method++++++++++");
//        proceedingJoinPoint.proceed();
//        LOGGER.info("After completion");
//    }

    @Around("execution(* java.lang.StringBuilder.append(..))")
    public Object testStr(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("++++++++StringBuilder.append() called++++++");
        Object obj = proceedingJoinPoint.proceed();
        LOGGER.info("++++++++StringBuilder.append() completed++++++");
        return obj;
    }

}
