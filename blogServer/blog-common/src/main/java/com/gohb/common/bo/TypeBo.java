package com.gohb.common.bo;

import com.gohb.common.entity.TypeEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class TypeBo extends TypeEntity implements Serializable {
    private Integer typeCount;
}
