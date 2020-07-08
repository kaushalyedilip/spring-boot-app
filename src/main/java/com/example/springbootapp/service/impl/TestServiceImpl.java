package com.example.springbootapp.service.impl;

import com.example.springbootapp.service.EmployeeService;
import com.example.springbootapp.service.TestService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class TestServiceImpl implements TestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private EmployeeService employeeService;


    public TestServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Long m1(Long a, Long b) {
        //testPrivate();
        LOGGER.info("+++++++++TestServiceImpl.m1() method called++++++++++");
        Long res = a+b;
        return res;
    }

    @Override
    public void m2() {
        employeeService.emp();
        LOGGER.info("+++++++++TestServiceImpl.m2() method called++++++++++");
    }

//    private void testPrivate() {
//        LOGGER.info("++++++++test private+++++++++");
//    }
}
