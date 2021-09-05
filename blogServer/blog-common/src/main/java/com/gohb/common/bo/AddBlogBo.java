package com.gohb.common.bo;

import com.gohb.common.entity.BlogEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class AddBlogBo extends BlogEntity implements Serializable {
    private Long[] value; // 存放的是博客对应的标签列表
}
