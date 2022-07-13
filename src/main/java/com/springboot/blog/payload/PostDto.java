package com.springboot.blog.payload;

import lombok.Data;

import java.util.Set;
import com.springboot.blog.entity.Comment;

@Data
public class PostDto {
    private Long id;
    private String title;
    private String description;
    private String content;
    private Set<CommentDto> comments;
}
