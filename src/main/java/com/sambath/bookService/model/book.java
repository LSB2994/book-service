package com.sambath.bookService.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@DynamoDBTable(tableName = "BOOKS_INFO_TABLE")
public class book {
    @DynamoDBHashKey(attributeName = "BookId")
    private String bookId;
    @DynamoDBHashKey(attributeName = "BookTitle")
    private String bookTitle;
    @DynamoDBHashKey(attributeName = "BookImageUrl")
    private String bookImageUrl;
    @DynamoDBHashKey(attributeName = "BookPrice")
    private Double bookPrice;
}
