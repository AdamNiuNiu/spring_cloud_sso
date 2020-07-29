package com.example.auth.exception;


import com.example.auth.response.AuthCode;

/**
 * 自定义异常类型
 * @author Administrator
 * @version 1.0
 * @create 2018-09-14 17:28
 **/
public class CustomException extends RuntimeException {

    //错误代码
    AuthCode resultCode;

    public CustomException(AuthCode resultCode){
        this.resultCode = resultCode;
    }
    public AuthCode getResultCode(){
        return resultCode;
    }


}
