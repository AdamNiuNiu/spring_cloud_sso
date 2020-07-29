package com.example.auth.exception;


import com.example.auth.response.AuthCode;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-14 17:31
 **/
public class ExceptionCast {

    public static void cast(AuthCode resultCode){
        throw new CustomException(resultCode);
    }
}
