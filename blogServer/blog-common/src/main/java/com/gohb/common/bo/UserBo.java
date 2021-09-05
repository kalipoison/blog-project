package com.gohb.common.bo;

import com.gohb.common.entity.UserEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserBo extends UserEntity implements Serializable {
    private String verKey;  // 缓存在redis中的验证码的key
    private String code; // 登录时的验证码
}
