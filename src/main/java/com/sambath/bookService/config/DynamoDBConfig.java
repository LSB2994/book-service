package com.sambath.bookService.config;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {
    @Autowired
    private AWSCredentialsProvider credentialsProvider;
    @Bean
    AmazonDynamoDB amazonDynamoDB() {
        final AmazonDynamoDB amazonDynamoDB = AmazonDynamoDBAsyncClientBuilder.standard()
                .withCredentials(credentialsProvider)
                .withRegion(Regions.AP_EAST_1)
                .build();
        return amazonDynamoDB;
    }

    @Bean
    DynamoDBMapper dynamoDBMapper() {
        return new DynamoDBMapper(amazonDynamoDB());
    }
}
