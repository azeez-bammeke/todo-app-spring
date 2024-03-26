package com.todo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}