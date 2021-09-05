package com.gohb.common.bo;

import com.gohb.common.entity.TagEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class TagBo extends TagEntity implements Serializable {
    private Integer tagCount;
}
