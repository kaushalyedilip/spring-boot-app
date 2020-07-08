package com.example.springbootapp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.amazon.awssdk.awscore.exception.AwsServiceException;

import org.springframework.stereotype.Service;

import java.time.Duration;

import software.amazon.awssdk.core.ResponseBytes;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.core.sync.ResponseTransformer;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3AsyncClient;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;
import software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsIterable;
import software.amazon.awssdk.services.s3.paginators.ListObjectVersionsIterable;
import software.amazon.awssdk.services.s3.paginators.ListObjectsV2Iterable;
import software.amazon.awssdk.services.s3.paginators.ListPartsIterable;

import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Consumer;

//@Service
public class S3ClientService implements S3Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(S3ClientService.class);



    //@Autowired
    private S3Client s3Client;

    public S3ClientService(S3Client s3Client) {
        this.s3Client = s3Client;
    }

    @Override
    public AbortMultipartUploadResponse abortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest)
        throws NoSuchUploadException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public AbortMultipartUploadResponse abortMultipartUpload(Consumer<AbortMultipartUploadRequest.Builder> abortMultipartUploadRequest)
        throws NoSuchUploadException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public CompleteMultipartUploadResponse completeMultipartUpload(CompleteMultipartUploadRequest completeMultipartUploadRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public CompleteMultipartUploadResponse completeMultipartUpload(Consumer<CompleteMultipartUploadRequest.Builder> completeMultipartUploadRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public CopyObjectResponse copyObject(CopyObjectRequest copyObjectRequest)
        throws ObjectNotInActiveTierErrorException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public CopyObjectResponse copyObject(Consumer<CopyObjectRequest.Builder> copyObjectRequest)
        throws ObjectNotInActiveTierErrorException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public CreateBucketResponse createBucket(CreateBucketRequest createBucketRequest)
        throws BucketAlreadyExistsException, BucketAlreadyOwnedByYouException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public CreateBucketResponse createBucket(Consumer<CreateBucketRequest.Builder> createBucketRequest)
        throws BucketAlreadyExistsException, BucketAlreadyOwnedByYouException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public CreateMultipartUploadResponse createMultipartUpload(CreateMultipartUploadRequest createMultipartUploadRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public CreateMultipartUploadResponse createMultipartUpload(Consumer<CreateMultipartUploadRequest.Builder> createMultipartUploadRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest deleteBucketRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketResponse deleteBucket(Consumer<DeleteBucketRequest.Builder> deleteBucketRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketAnalyticsConfigurationResponse deleteBucketAnalyticsConfiguration(
        DeleteBucketAnalyticsConfigurationRequest deleteBucketAnalyticsConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketAnalyticsConfigurationResponse deleteBucketAnalyticsConfiguration(
        Consumer<DeleteBucketAnalyticsConfigurationRequest.Builder> deleteBucketAnalyticsConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketCorsResponse deleteBucketCors(DeleteBucketCorsRequest deleteBucketCorsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketCorsResponse deleteBucketCors(Consumer<DeleteBucketCorsRequest.Builder> deleteBucketCorsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketEncryptionResponse deleteBucketEncryption(DeleteBucketEncryptionRequest deleteBucketEncryptionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketEncryptionResponse deleteBucketEncryption(Consumer<DeleteBucketEncryptionRequest.Builder> deleteBucketEncryptionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketInventoryConfigurationResponse deleteBucketInventoryConfiguration(
        DeleteBucketInventoryConfigurationRequest deleteBucketInventoryConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketInventoryConfigurationResponse deleteBucketInventoryConfiguration(
        Consumer<DeleteBucketInventoryConfigurationRequest.Builder> deleteBucketInventoryConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketLifecycleResponse deleteBucketLifecycle(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketLifecycleResponse deleteBucketLifecycle(Consumer<DeleteBucketLifecycleRequest.Builder> deleteBucketLifecycleRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketMetricsConfigurationResponse deleteBucketMetricsConfiguration(
        DeleteBucketMetricsConfigurationRequest deleteBucketMetricsConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketMetricsConfigurationResponse deleteBucketMetricsConfiguration(
        Consumer<DeleteBucketMetricsConfigurationRequest.Builder> deleteBucketMetricsConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketPolicyResponse deleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketPolicyResponse deleteBucketPolicy(Consumer<DeleteBucketPolicyRequest.Builder> deleteBucketPolicyRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketReplicationResponse deleteBucketReplication(DeleteBucketReplicationRequest deleteBucketReplicationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketReplicationResponse deleteBucketReplication(Consumer<DeleteBucketReplicationRequest.Builder> deleteBucketReplicationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketTaggingResponse deleteBucketTagging(DeleteBucketTaggingRequest deleteBucketTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketTaggingResponse deleteBucketTagging(Consumer<DeleteBucketTaggingRequest.Builder> deleteBucketTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketWebsiteResponse deleteBucketWebsite(DeleteBucketWebsiteRequest deleteBucketWebsiteRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteBucketWebsiteResponse deleteBucketWebsite(Consumer<DeleteBucketWebsiteRequest.Builder> deleteBucketWebsiteRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteObjectResponse deleteObject(DeleteObjectRequest deleteObjectRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteObjectResponse deleteObject(Consumer<DeleteObjectRequest.Builder> deleteObjectRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteObjectTaggingResponse deleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteObjectTaggingResponse deleteObjectTagging(Consumer<DeleteObjectTaggingRequest.Builder> deleteObjectTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteObjectsResponse deleteObjects(DeleteObjectsRequest deleteObjectsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeleteObjectsResponse deleteObjects(Consumer<DeleteObjectsRequest.Builder> deleteObjectsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeletePublicAccessBlockResponse deletePublicAccessBlock(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public DeletePublicAccessBlockResponse deletePublicAccessBlock(Consumer<DeletePublicAccessBlockRequest.Builder> deletePublicAccessBlockRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketAccelerateConfigurationResponse getBucketAccelerateConfiguration(
        GetBucketAccelerateConfigurationRequest getBucketAccelerateConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketAccelerateConfigurationResponse getBucketAccelerateConfiguration(
        Consumer<GetBucketAccelerateConfigurationRequest.Builder> getBucketAccelerateConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketAclResponse getBucketAcl(GetBucketAclRequest getBucketAclRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketAclResponse getBucketAcl(Consumer<GetBucketAclRequest.Builder> getBucketAclRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketAnalyticsConfigurationResponse getBucketAnalyticsConfiguration(
        GetBucketAnalyticsConfigurationRequest getBucketAnalyticsConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketAnalyticsConfigurationResponse getBucketAnalyticsConfiguration(
        Consumer<GetBucketAnalyticsConfigurationRequest.Builder> getBucketAnalyticsConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketCorsResponse getBucketCors(GetBucketCorsRequest getBucketCorsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketCorsResponse getBucketCors(Consumer<GetBucketCorsRequest.Builder> getBucketCorsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketEncryptionResponse getBucketEncryption(GetBucketEncryptionRequest getBucketEncryptionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketEncryptionResponse getBucketEncryption(Consumer<GetBucketEncryptionRequest.Builder> getBucketEncryptionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketInventoryConfigurationResponse getBucketInventoryConfiguration(
        GetBucketInventoryConfigurationRequest getBucketInventoryConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketInventoryConfigurationResponse getBucketInventoryConfiguration(
        Consumer<GetBucketInventoryConfigurationRequest.Builder> getBucketInventoryConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketLifecycleConfigurationResponse getBucketLifecycleConfiguration(
        GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketLifecycleConfigurationResponse getBucketLifecycleConfiguration(
        Consumer<GetBucketLifecycleConfigurationRequest.Builder> getBucketLifecycleConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketLocationResponse getBucketLocation(GetBucketLocationRequest getBucketLocationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketLocationResponse getBucketLocation(Consumer<GetBucketLocationRequest.Builder> getBucketLocationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketLoggingResponse getBucketLogging(GetBucketLoggingRequest getBucketLoggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketLoggingResponse getBucketLogging(Consumer<GetBucketLoggingRequest.Builder> getBucketLoggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketMetricsConfigurationResponse getBucketMetricsConfiguration(GetBucketMetricsConfigurationRequest getBucketMetricsConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketMetricsConfigurationResponse getBucketMetricsConfiguration(
        Consumer<GetBucketMetricsConfigurationRequest.Builder> getBucketMetricsConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketNotificationConfigurationResponse getBucketNotificationConfiguration(
        GetBucketNotificationConfigurationRequest getBucketNotificationConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketNotificationConfigurationResponse getBucketNotificationConfiguration(
        Consumer<GetBucketNotificationConfigurationRequest.Builder> getBucketNotificationConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketPolicyResponse getBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketPolicyResponse getBucketPolicy(Consumer<GetBucketPolicyRequest.Builder> getBucketPolicyRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketPolicyStatusResponse getBucketPolicyStatus(GetBucketPolicyStatusRequest getBucketPolicyStatusRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketPolicyStatusResponse getBucketPolicyStatus(Consumer<GetBucketPolicyStatusRequest.Builder> getBucketPolicyStatusRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketReplicationResponse getBucketReplication(GetBucketReplicationRequest getBucketReplicationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketReplicationResponse getBucketReplication(Consumer<GetBucketReplicationRequest.Builder> getBucketReplicationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketRequestPaymentResponse getBucketRequestPayment(GetBucketRequestPaymentRequest getBucketRequestPaymentRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketRequestPaymentResponse getBucketRequestPayment(Consumer<GetBucketRequestPaymentRequest.Builder> getBucketRequestPaymentRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketTaggingResponse getBucketTagging(GetBucketTaggingRequest getBucketTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketTaggingResponse getBucketTagging(Consumer<GetBucketTaggingRequest.Builder> getBucketTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketVersioningResponse getBucketVersioning(GetBucketVersioningRequest getBucketVersioningRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketVersioningResponse getBucketVersioning(Consumer<GetBucketVersioningRequest.Builder> getBucketVersioningRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketWebsiteResponse getBucketWebsite(GetBucketWebsiteRequest getBucketWebsiteRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetBucketWebsiteResponse getBucketWebsite(Consumer<GetBucketWebsiteRequest.Builder> getBucketWebsiteRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public <ReturnT> ReturnT getObject(GetObjectRequest getObjectRequest, ResponseTransformer<GetObjectResponse, ReturnT> responseTransformer)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public <ReturnT> ReturnT getObject(Consumer<GetObjectRequest.Builder> getObjectRequest, ResponseTransformer<GetObjectResponse, ReturnT> responseTransformer)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectResponse getObject(GetObjectRequest getObjectRequest, Path filePath)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectResponse getObject(Consumer<GetObjectRequest.Builder> getObjectRequest, Path filePath)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ResponseInputStream<GetObjectResponse> getObject(GetObjectRequest getObjectRequest)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ResponseInputStream<GetObjectResponse> getObject(Consumer<GetObjectRequest.Builder> getObjectRequest)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ResponseBytes<GetObjectResponse> getObjectAsBytes(GetObjectRequest getObjectRequest)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ResponseBytes<GetObjectResponse> getObjectAsBytes(Consumer<GetObjectRequest.Builder> getObjectRequest)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectAclResponse getObjectAcl(GetObjectAclRequest getObjectAclRequest)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectAclResponse getObjectAcl(Consumer<GetObjectAclRequest.Builder> getObjectAclRequest)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectLegalHoldResponse getObjectLegalHold(GetObjectLegalHoldRequest getObjectLegalHoldRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectLegalHoldResponse getObjectLegalHold(Consumer<GetObjectLegalHoldRequest.Builder> getObjectLegalHoldRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectLockConfigurationResponse getObjectLockConfiguration(GetObjectLockConfigurationRequest getObjectLockConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectLockConfigurationResponse getObjectLockConfiguration(Consumer<GetObjectLockConfigurationRequest.Builder> getObjectLockConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectRetentionResponse getObjectRetention(GetObjectRetentionRequest getObjectRetentionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectRetentionResponse getObjectRetention(Consumer<GetObjectRetentionRequest.Builder> getObjectRetentionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectTaggingResponse getObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectTaggingResponse getObjectTagging(Consumer<GetObjectTaggingRequest.Builder> getObjectTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public <ReturnT> ReturnT getObjectTorrent(GetObjectTorrentRequest getObjectTorrentRequest,
                                              ResponseTransformer<GetObjectTorrentResponse, ReturnT> responseTransformer)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public <ReturnT> ReturnT getObjectTorrent(Consumer<GetObjectTorrentRequest.Builder> getObjectTorrentRequest,
                                              ResponseTransformer<GetObjectTorrentResponse, ReturnT> responseTransformer)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectTorrentResponse getObjectTorrent(GetObjectTorrentRequest getObjectTorrentRequest, Path filePath)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetObjectTorrentResponse getObjectTorrent(Consumer<GetObjectTorrentRequest.Builder> getObjectTorrentRequest, Path filePath)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ResponseInputStream<GetObjectTorrentResponse> getObjectTorrent(GetObjectTorrentRequest getObjectTorrentRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ResponseInputStream<GetObjectTorrentResponse> getObjectTorrent(Consumer<GetObjectTorrentRequest.Builder> getObjectTorrentRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ResponseBytes<GetObjectTorrentResponse> getObjectTorrentAsBytes(GetObjectTorrentRequest getObjectTorrentRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ResponseBytes<GetObjectTorrentResponse> getObjectTorrentAsBytes(Consumer<GetObjectTorrentRequest.Builder> getObjectTorrentRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetPublicAccessBlockResponse getPublicAccessBlock(GetPublicAccessBlockRequest getPublicAccessBlockRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public GetPublicAccessBlockResponse getPublicAccessBlock(Consumer<GetPublicAccessBlockRequest.Builder> getPublicAccessBlockRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public HeadBucketResponse headBucket(HeadBucketRequest headBucketRequest)
        throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public HeadBucketResponse headBucket(Consumer<HeadBucketRequest.Builder> headBucketRequest)
        throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public HeadObjectResponse headObject(HeadObjectRequest headObjectRequest) throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public HeadObjectResponse headObject(Consumer<HeadObjectRequest.Builder> headObjectRequest)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListBucketAnalyticsConfigurationsResponse listBucketAnalyticsConfigurations(
        ListBucketAnalyticsConfigurationsRequest listBucketAnalyticsConfigurationsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListBucketAnalyticsConfigurationsResponse listBucketAnalyticsConfigurations(
        Consumer<ListBucketAnalyticsConfigurationsRequest.Builder> listBucketAnalyticsConfigurationsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListBucketInventoryConfigurationsResponse listBucketInventoryConfigurations(
        ListBucketInventoryConfigurationsRequest listBucketInventoryConfigurationsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListBucketInventoryConfigurationsResponse listBucketInventoryConfigurations(
        Consumer<ListBucketInventoryConfigurationsRequest.Builder> listBucketInventoryConfigurationsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListBucketMetricsConfigurationsResponse listBucketMetricsConfigurations(
        ListBucketMetricsConfigurationsRequest listBucketMetricsConfigurationsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListBucketMetricsConfigurationsResponse listBucketMetricsConfigurations(
        Consumer<ListBucketMetricsConfigurationsRequest.Builder> listBucketMetricsConfigurationsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListBucketsResponse listBuckets() throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListBucketsResponse listBuckets(ListBucketsRequest listBucketsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListBucketsResponse listBuckets(Consumer<ListBucketsRequest.Builder> listBucketsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListMultipartUploadsResponse listMultipartUploads(ListMultipartUploadsRequest listMultipartUploadsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListMultipartUploadsResponse listMultipartUploads(Consumer<ListMultipartUploadsRequest.Builder> listMultipartUploadsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListMultipartUploadsIterable listMultipartUploadsPaginator(ListMultipartUploadsRequest listMultipartUploadsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListMultipartUploadsIterable listMultipartUploadsPaginator(Consumer<ListMultipartUploadsRequest.Builder> listMultipartUploadsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectVersionsResponse listObjectVersions(ListObjectVersionsRequest listObjectVersionsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectVersionsResponse listObjectVersions(Consumer<ListObjectVersionsRequest.Builder> listObjectVersionsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectVersionsIterable listObjectVersionsPaginator(ListObjectVersionsRequest listObjectVersionsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectVersionsIterable listObjectVersionsPaginator(Consumer<ListObjectVersionsRequest.Builder> listObjectVersionsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectsResponse listObjects(ListObjectsRequest listObjectsRequest)
        throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectsResponse listObjects(Consumer<ListObjectsRequest.Builder> listObjectsRequest)
        throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectsV2Response listObjectsV2(ListObjectsV2Request listObjectsV2Request)
        throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectsV2Response listObjectsV2(Consumer<ListObjectsV2Request.Builder> listObjectsV2Request)
        throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectsV2Iterable listObjectsV2Paginator(ListObjectsV2Request listObjectsV2Request)
        throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListObjectsV2Iterable listObjectsV2Paginator(Consumer<ListObjectsV2Request.Builder> listObjectsV2Request)
        throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListPartsResponse listParts(ListPartsRequest listPartsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListPartsResponse listParts(Consumer<ListPartsRequest.Builder> listPartsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListPartsIterable listPartsPaginator(ListPartsRequest listPartsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public ListPartsIterable listPartsPaginator(Consumer<ListPartsRequest.Builder> listPartsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketAccelerateConfigurationResponse putBucketAccelerateConfiguration(
        PutBucketAccelerateConfigurationRequest putBucketAccelerateConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketAccelerateConfigurationResponse putBucketAccelerateConfiguration(
        Consumer<PutBucketAccelerateConfigurationRequest.Builder> putBucketAccelerateConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketAclResponse putBucketAcl(PutBucketAclRequest putBucketAclRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketAclResponse putBucketAcl(Consumer<PutBucketAclRequest.Builder> putBucketAclRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketAnalyticsConfigurationResponse putBucketAnalyticsConfiguration(
        PutBucketAnalyticsConfigurationRequest putBucketAnalyticsConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketAnalyticsConfigurationResponse putBucketAnalyticsConfiguration(
        Consumer<PutBucketAnalyticsConfigurationRequest.Builder> putBucketAnalyticsConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketCorsResponse putBucketCors(PutBucketCorsRequest putBucketCorsRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketCorsResponse putBucketCors(Consumer<PutBucketCorsRequest.Builder> putBucketCorsRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketEncryptionResponse putBucketEncryption(PutBucketEncryptionRequest putBucketEncryptionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketEncryptionResponse putBucketEncryption(Consumer<PutBucketEncryptionRequest.Builder> putBucketEncryptionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketInventoryConfigurationResponse putBucketInventoryConfiguration(
        PutBucketInventoryConfigurationRequest putBucketInventoryConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketInventoryConfigurationResponse putBucketInventoryConfiguration(
        Consumer<PutBucketInventoryConfigurationRequest.Builder> putBucketInventoryConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketLifecycleConfigurationResponse putBucketLifecycleConfiguration(
        PutBucketLifecycleConfigurationRequest putBucketLifecycleConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketLifecycleConfigurationResponse putBucketLifecycleConfiguration(
        Consumer<PutBucketLifecycleConfigurationRequest.Builder> putBucketLifecycleConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketLoggingResponse putBucketLogging(PutBucketLoggingRequest putBucketLoggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketLoggingResponse putBucketLogging(Consumer<PutBucketLoggingRequest.Builder> putBucketLoggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketMetricsConfigurationResponse putBucketMetricsConfiguration(PutBucketMetricsConfigurationRequest putBucketMetricsConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketMetricsConfigurationResponse putBucketMetricsConfiguration(
        Consumer<PutBucketMetricsConfigurationRequest.Builder> putBucketMetricsConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketNotificationConfigurationResponse putBucketNotificationConfiguration(
        PutBucketNotificationConfigurationRequest putBucketNotificationConfigurationRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketNotificationConfigurationResponse putBucketNotificationConfiguration(
        Consumer<PutBucketNotificationConfigurationRequest.Builder> putBucketNotificationConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketPolicyResponse putBucketPolicy(PutBucketPolicyRequest putBucketPolicyRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketPolicyResponse putBucketPolicy(Consumer<PutBucketPolicyRequest.Builder> putBucketPolicyRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketReplicationResponse putBucketReplication(PutBucketReplicationRequest putBucketReplicationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketReplicationResponse putBucketReplication(Consumer<PutBucketReplicationRequest.Builder> putBucketReplicationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketRequestPaymentResponse putBucketRequestPayment(PutBucketRequestPaymentRequest putBucketRequestPaymentRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketRequestPaymentResponse putBucketRequestPayment(Consumer<PutBucketRequestPaymentRequest.Builder> putBucketRequestPaymentRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketTaggingResponse putBucketTagging(PutBucketTaggingRequest putBucketTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketTaggingResponse putBucketTagging(Consumer<PutBucketTaggingRequest.Builder> putBucketTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketVersioningResponse putBucketVersioning(PutBucketVersioningRequest putBucketVersioningRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketVersioningResponse putBucketVersioning(Consumer<PutBucketVersioningRequest.Builder> putBucketVersioningRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketWebsiteResponse putBucketWebsite(PutBucketWebsiteRequest putBucketWebsiteRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutBucketWebsiteResponse putBucketWebsite(Consumer<PutBucketWebsiteRequest.Builder> putBucketWebsiteRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectResponse putObject(PutObjectRequest putObjectRequest, RequestBody requestBody) {
        System.out.println("+++++++S3ClientService.putObject++++++++++++++");
        PutObjectResponse putObjectResponse = s3Client.putObject(putObjectRequest, requestBody);
        return putObjectResponse;
    }

    @Override
    public PutObjectAclResponse putObjectAcl(PutObjectAclRequest putObjectAclRequest)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectAclResponse putObjectAcl(Consumer<PutObjectAclRequest.Builder> putObjectAclRequest)
        throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectLegalHoldResponse putObjectLegalHold(PutObjectLegalHoldRequest putObjectLegalHoldRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectLegalHoldResponse putObjectLegalHold(Consumer<PutObjectLegalHoldRequest.Builder> putObjectLegalHoldRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectLockConfigurationResponse putObjectLockConfiguration(PutObjectLockConfigurationRequest putObjectLockConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectLockConfigurationResponse putObjectLockConfiguration(Consumer<PutObjectLockConfigurationRequest.Builder> putObjectLockConfigurationRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectRetentionResponse putObjectRetention(PutObjectRetentionRequest putObjectRetentionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectRetentionResponse putObjectRetention(Consumer<PutObjectRetentionRequest.Builder> putObjectRetentionRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectTaggingResponse putObjectTagging(PutObjectTaggingRequest putObjectTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutObjectTaggingResponse putObjectTagging(Consumer<PutObjectTaggingRequest.Builder> putObjectTaggingRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutPublicAccessBlockResponse putPublicAccessBlock(PutPublicAccessBlockRequest putPublicAccessBlockRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public PutPublicAccessBlockResponse putPublicAccessBlock(Consumer<PutPublicAccessBlockRequest.Builder> putPublicAccessBlockRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public RestoreObjectResponse restoreObject(RestoreObjectRequest restoreObjectRequest)
        throws ObjectAlreadyInActiveTierErrorException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public RestoreObjectResponse restoreObject(Consumer<RestoreObjectRequest.Builder> restoreObjectRequest)
        throws ObjectAlreadyInActiveTierErrorException, AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public UploadPartResponse uploadPart(UploadPartRequest uploadPartRequest, RequestBody requestBody)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public UploadPartResponse uploadPart(Consumer<UploadPartRequest.Builder> uploadPartRequest, RequestBody requestBody)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public UploadPartResponse uploadPart(UploadPartRequest uploadPartRequest, Path filePath) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public UploadPartResponse uploadPart(Consumer<UploadPartRequest.Builder> uploadPartRequest, Path filePath)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public UploadPartCopyResponse uploadPartCopy(UploadPartCopyRequest uploadPartCopyRequest) throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public UploadPartCopyResponse uploadPartCopy(Consumer<UploadPartCopyRequest.Builder> uploadPartCopyRequest)
        throws AwsServiceException, SdkClientException, S3Exception {
        return null;
    }

    @Override
    public String serviceName() {
        return null;
    }

    @Override
    public void close() {

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        S3ClientService that = (S3ClientService) o;
        return s3Client.equals(that.s3Client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s3Client);
    }

//    @Override
//    public CompletableFuture<PutObjectResponse> putObject(PutObjectRequest putObjectRequest,
//                                                          AsyncRequestBody requestBody) {
//        s3AsyncClient = S3AsyncClient.builder().region(Region.US_EAST_1).build();
//
//        return s3AsyncClient.putObject(putObjectRequest, requestBody);
//    }
}
