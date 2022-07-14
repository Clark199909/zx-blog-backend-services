package com.springboot.blog.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "Sign up model information")
@Data
public class SignUpDto {

    @ApiModelProperty(value = "Sign up name")
    private String name;

    @ApiModelProperty(value = "Sign up username")
    private String username;

    @ApiModelProperty(value = "Sign up email")
    private String email;

    @ApiModelProperty(value = "Sign up password")
    private String password;
}
