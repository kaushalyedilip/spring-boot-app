package com.example.springbootapp.resources;

import com.example.springbootapp.service.TestService;
import com.example.springbootapp.service.impl.S3ClientService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.time.Duration;

import javax.annotation.PostConstruct;

import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;
import software.amazon.awssdk.services.s3.presigner.S3Presigner;
import software.amazon.awssdk.services.s3.presigner.model.GetObjectPresignRequest;
import software.amazon.awssdk.services.s3.presigner.model.PresignedGetObjectRequest;

import java.util.Random;

@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private S3Client s3Client;

    //@Autowired
    //private TestAspect testAspect;

    @PostConstruct
    public void init(){
        LOGGER.info("+++++++++Initialize S3ClientService+++++++++");
//        DefaultListableBeanFactory context =
//            new DefaultListableBeanFactory();
//        s3ClientService = (S3ClientService) applicationContext.getBean("s3ClientService");
    }


    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }

    @GetMapping("/test-aspect")
    public void testAspect() {
         testService.m1(10l, 10l);
    }

    @GetMapping("/s3/putObject")
    public void putObject() throws IOException {
//        S3Client s3Client = S3Client.builder()
//                           .overrideConfiguration(
//                               ClientOverrideConfiguration.builder()
//                                                          .apiCallTimeout(Duration.ofSeconds(30))
//                                                          .apiCallAttemptTimeout(Duration.ofSeconds(40))
//                                                          .retryPolicy(r-> r.numRetries(2))
//                                                          .build()).region(Region.US_EAST_1).build();

        //PutObjectResponse putObjectResponse = s3ClientService.putObject(putObjectRequest, RequestBody.fromFile(file));

       // File file = new File("/Users/dilipkaushalye/Documents/test-image.png");
        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                                                            .bucket("springboard-example")
                                                            .key("test-image-sb-app2")
                                                            .build();

        LOGGER.info("Call API");
        PutObjectResponse putObjectResponse = s3Client.putObject(putObjectRequest, RequestBody.fromByteBuffer(getRandomByteBuffer(256)));

        LOGGER.info("Status Code: {}", putObjectResponse.sdkHttpResponse().statusCode());
        //s3ClientService.putObject(putObjectRequest, RequestBody.fromFile(file));
    }

    @GetMapping("/toString")
    public void toStringTest(){
        String str = "Test".toString();
    }

    @GetMapping("/getObjectPresignedURL")
    public void getObjectPresignedURL() {
      S3Presigner presigner = S3Presigner.builder()
                               .region(Region.US_EAST_1)
                               //.endpointOverride(URI.create("http://www.temp.com"))
                               .build();

        String key = "test-image";
        // Create a GetObjectRequest to be pre-signed
        GetObjectRequest getObjectRequest = GetObjectRequest.builder()
                                                            .bucket("springboard-example")
                                                            .key(key)
                                                            .build();

        // Create a GetObjectPresignRequest to specify the signature duration
        GetObjectPresignRequest getObjectPresignRequest =
            GetObjectPresignRequest.builder()
                                   .signatureDuration(Duration.ofMinutes(1))
                                   .getObjectRequest(getObjectRequest)
                                   .build();

        // Generate the presigned request
        PresignedGetObjectRequest presignedGetObjectRequest =
            presigner.presignGetObject(getObjectPresignRequest);

        // Log the presigned URL, for example.
        System.out.println("Presigned URL: " + presignedGetObjectRequest.url());
    }

    private static ByteBuffer getRandomByteBuffer(int size) throws IOException {
        byte[] b = new byte[size];
        new Random().nextBytes(b);
        return ByteBuffer.wrap(b);
    }
}
