package com.example.springbootapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    public void emp () {
        LOGGER.info("+++++++++Employee Service+++++++++");
    }
}
