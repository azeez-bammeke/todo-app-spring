package com.todo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Data
@Document(collection = "user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private Integer age;
    private List<Address> addresses;
    private List<String> todoIds;
}
