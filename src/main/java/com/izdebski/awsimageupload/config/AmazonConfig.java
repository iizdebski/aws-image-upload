package com.izdebski.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                "AKIAICQP3P7FZKFV7A5A",
                "kMFKj3Oc04SuCC9pW01QYiU2hE3kHo35uqdLMCtM"
    );

        return AmazonS3ClientBuilder
                .standard()
                .withRegion("eu-central-1") // The first region to try your request against
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}