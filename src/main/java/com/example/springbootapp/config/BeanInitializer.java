package com.example.springbootapp.config;

import com.example.springbootapp.aspect.TestAspect;
import com.example.springbootapp.service.TestService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class BeanInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(BeanInitializer.class);

    @Autowired
    ApplicationContext applicationContext;


    @Autowired
    private TestService testService;

    @PostConstruct
    public void init() {
        LOGGER.info("+++++++++++++++init+++++++++++++++");
//        DefaultListableBeanFactory context =
//            new DefaultListableBeanFactory();
//
//        //define and register MyOtherBean
//        GenericBeanDefinition beanOtherDef = new GenericBeanDefinition();
//        beanOtherDef.setBeanClass(S3ClientServiceImpl.class);
//        context.registerBeanDefinition("s3ClientService", beanOtherDef);

//        GenericBeanDefinition bd = new GenericBeanDefinition();
//        bd.setBeanClass(S3ClientServiceImpl.class);
//        bd.getPropertyValues().add("strProp", "my string property");
//
//        ((DefaultListableBeanFactory) beanFactory)
//            .registerBeanDefinition("myBeanName", bd);

        final AutowireCapableBeanFactory autowireBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        final BeanDefinitionRegistry registry = (BeanDefinitionRegistry) autowireBeanFactory;
        final ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(TestAspect.class);
        beanDefinition.setLazyInit(false);
        beanDefinition.setAbstract(false);
        beanDefinition.setAutowireCandidate(true);
        beanDefinition.setScope("singleton");

        constructorArgumentValues.addGenericArgumentValue(testService);
        beanDefinition.setConstructorArgumentValues(constructorArgumentValues);


        //registry.registerBeanDefinition("testAspect", beanDefinition);

        //applicationContext.getBean("testAspect");
        //bd.getPropertyValues().add("strProp", "my string property");
        LOGGER.info("+++++++++++++++Bean Registered+++++++++++++++");
    }

}
