package com.todo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Todo {
    @Id
    private String todoId;
    private String title;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;
    private Integer priority;
    private List<String> status;
    private String description;
}
