package com.example.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.springbootapp.aspect.TestAspect;
import com.example.springbootapp.service.EmployeeService;
import com.example.springbootapp.service.TestService;
import com.example.springbootapp.service.impl.TestServiceImpl;

import org.aspectj.lang.Aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
//@RunWith(PowerMockRunner.class)
public class TestServiceTest {

    Logger LOGGER = LoggerFactory.getLogger(TestServiceTest.class);

    @Mock
    private EmployeeService employeeService;

    @Mock
    private TestServiceImpl testServiceImpl = new TestServiceImpl(employeeService);

    @Mock
    private TestService testService;

    @InjectMocks
    private TestAspect testAspect = Aspects.aspectOf(TestAspect.class);

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testM1() {

        //doNothing().when(testServiceImpl).m2();

       // testServiceImpl.m2();

        when(testServiceImpl.m1(10l, 10l)).thenReturn(20l);

        Long result = testServiceImpl.m1(10l,10l);
        LOGGER.info("Result: {}", result);
        assertEquals(20l,(long)result);
    }

    @Test
    public void testM2() throws Throwable {

        //doNothing().when(testAspect).test(any(ProceedingJoinPoint.class));

        doNothing().when(employeeService).emp();
        //doNothing().when(testService).m2();

        //employeeService.emp();

        testServiceImpl.m2();
        //Long result = testService.m1(10l,10l);

        //assertEquals(20l,(long)result);
    }



}
