package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {
    private long id;

    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    @NotEmpty(message = "Email should not be null or empty")
    @Email(message = "Email format is not correct")
    private String email;

    @NotEmpty(message = "Comment body should not be empty")
    @Size(min = 10, message = "Comment body should be at least 10 characters")
    private String body;
}
