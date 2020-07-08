package com.example.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;

import java.util.Random;

import com.example.springbootapp.aspect.TestAspect;
import com.example.springbootapp.service.TestService;
import com.example.springbootapp.service.impl.S3ClientService;

import org.aspectj.lang.Aspects;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.nio.ByteBuffer;

import software.amazon.awssdk.http.SdkHttpResponse;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class S3ClientServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(S3ClientService.class);

    @Mock
    private S3Client s3Client;

    @InjectMocks
    private S3ClientService s3ClientService;
    //= new S3ClientService(s3Client);

    private static final String BUCKET_NAME = "springboard-example";
    private static final String OBJECT_NAME = "test-object";

    @Mock
    private TestAspect testAspect = Aspects.aspectOf(TestAspect.class);

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void putObjectTest() throws Throwable {

        PutObjectResponse mockedPutObjectResponse = mock(PutObjectResponse.class);

        SdkHttpResponse sdkHttpResponse = mock(SdkHttpResponse.class);

        LOGGER.info("Before mock putObject method");

        PutObjectRequest putObjectRequest = PutObjectRequest.builder().bucket(BUCKET_NAME).key(OBJECT_NAME).build();

        RequestBody requestBody = RequestBody.fromByteBuffer(getRandomByteBuffer(256));

        when(s3Client.putObject(any(PutObjectRequest.class), any(RequestBody.class))).thenReturn(mockedPutObjectResponse);

        LOGGER.info("After mock putObject method");

        when(mockedPutObjectResponse.sdkHttpResponse()).thenReturn(sdkHttpResponse);

        when(mockedPutObjectResponse.sdkHttpResponse().statusCode()).thenReturn(200);

        PutObjectResponse mockedPutObjectResponseResult = s3ClientService.putObject(putObjectRequest, requestBody);

        assertEquals(mockedPutObjectResponseResult.sdkHttpResponse().statusCode(), mockedPutObjectResponse.sdkHttpResponse().statusCode());
    }


    private static ByteBuffer getRandomByteBuffer(int size) throws IOException {
        byte[] byteArray = new byte[size];
        new Random().nextBytes(byteArray);
        return ByteBuffer.wrap(byteArray);
    }
}
