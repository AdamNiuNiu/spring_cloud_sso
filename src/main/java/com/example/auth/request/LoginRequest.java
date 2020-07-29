package com.example.auth.request;

//import com.xuecheng.framework.model.request.RequestData;
import com.example.auth.modle.RequestData;
import lombok.Data;
import lombok.ToString;

/**
 * Created by admin on 2018/3/5.
 */
@Data
@ToString
public class LoginRequest extends RequestData {

    String username;
    String password;
    String verifycode;

}
