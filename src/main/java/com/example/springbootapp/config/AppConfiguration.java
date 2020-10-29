package com.example.springbootapp.config;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import com.example.springbootapp.aspect.TestAspect;
import com.example.springbootapp.service.EmployeeService;
import com.example.springbootapp.service.TestService;
import com.example.springbootapp.service.impl.S3ClientService;
import com.example.springbootapp.service.impl.TestServiceImpl;

import org.aspectj.lang.Aspects;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisClusterConnection;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSentinelConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.resource.ClientResources;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableAspectJAutoProxy
public class AppConfiguration {

    //private static String HOST = "beacon-server-test-ro.shgirg.ng.0001.use1.cache.amazonaws.com";

    private static String HOST = "beacon-server-test.shgirg.ng.0001.use1.cache.amazonaws.com";

    private static String SB_HOST = "dev-springboard-exam.1nkg1k.ng.0001.use1.cache.amazonaws.com";
    private static String SB_HOST_READER = "dev-springboard-exam.1nkg1k.ng.0001.use1.cache.amazonaws.com";

    @Bean
    public TestAspect testAspect(TestService testService) {
        //return new TestAspect(testService);
        return Aspects.aspectOf(TestAspect.class);
    }

    @Bean
    public TestService testService(EmployeeService employeeService) {
        return new TestServiceImpl(employeeService);
    }

    @Bean
    public S3ClientService s3ClientService() {
        return new S3ClientService(S3Client.builder().region(Region.US_EAST_1).build());
    }



//    @Bean
//    public RedisTemplate<String, User> redisTemplate() {
//        RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//        return redisTemplate;
//    }

    @Bean
    public RedisClient redisClient() {
        RedisURI redisURI = RedisURI.builder().withHost(SB_HOST_READER).withPort(6379).build();
        return RedisClient.create(redisURI);

        //return RedisClient.create("redis://" + SB_HOST_READER);
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        return template;
    }
    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jedisConFactory;
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(5);
        poolConfig.setMaxIdle(5);
        poolConfig.setMinIdle(1);

        jedisConFactory = new JedisConnectionFactory(poolConfig);
        jedisConFactory.setHostName(HOST);
        jedisConFactory.setPort(6379);
        jedisConFactory.setUsePool(true);

        return jedisConFactory;
    }
}
