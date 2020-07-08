package com.example.springbootapp.config;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import com.example.springbootapp.aspect.TestAspect;
import com.example.springbootapp.service.EmployeeService;
import com.example.springbootapp.service.TestService;
import com.example.springbootapp.service.impl.S3ClientService;
import com.example.springbootapp.service.impl.TestServiceImpl;

import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfiguration {

//    @Bean
//    public S3Client s3Client() {
//
//    }

    @Bean
    public TestAspect testAspect(TestService testService) {
        //return new TestAspect(testService);
        return Aspects.aspectOf(TestAspect.class);
    }

    @Bean
    public TestService testService(EmployeeService employeeService) {
        return new TestServiceImpl(employeeService);
    }

//    @Bean
//    public S3Client s3Client() {
//        return S3Client.builder().region(Region.US_EAST_1).build();
//    }

    @Bean
    public S3ClientService s3ClientService() {
        return new S3ClientService(S3Client.builder().region(Region.US_EAST_1).build());
    }

}
