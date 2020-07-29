package com.example.auth.api;

import com.example.auth.modle.ResponseResult;
import com.example.auth.request.LoginRequest;
import com.example.auth.response.LoginResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.net.URISyntaxException;

@Api(value = "用户认证",description = "用户认证接口")
public interface AuthControllerApi {

    @ApiOperation("登录")
    public LoginResult login(LoginRequest loginRequest) throws URISyntaxException;

    @ApiOperation("退出")
    public ResponseResult logout();
}
