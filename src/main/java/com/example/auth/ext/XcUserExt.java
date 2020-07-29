package com.example.auth.ext;

import com.example.auth.domain.XcMenu;
import com.example.auth.domain.XcUser;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class XcUserExt extends XcUser {

//    权限信息
    private List<XcMenu> permissions;

    //企业信息
    private String companyId;
}
