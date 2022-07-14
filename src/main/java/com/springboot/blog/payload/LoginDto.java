package com.springboot.blog.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "Login model information")
@Data
public class LoginDto {

    @ApiModelProperty(value = "Login username or email")
    private String usernameOrEmail;

    @ApiModelProperty(value = "Login password")
    private String password;
}
