package com.gohb.common.bo;

import com.gohb.common.entity.BlogEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 设计博客模块查询的附加条件
 */
@Data
public class BlogBo extends BlogEntity implements Serializable {

    private String typeName;    // 分类名称
    private String nickname;    //用户昵称
    private String avatar;      //用户头像

}
