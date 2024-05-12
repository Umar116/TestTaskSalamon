package ru.Salamon;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Specifications {
    public String baseUrl = "https://jsonplaceholder.typicode.com/";

    public RequestSpecification header(){
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
//                .addFilter(new ResponseLoggingFilter())
//                .addFilter(new RequestLoggingFilter())
                .build();
    }

}
