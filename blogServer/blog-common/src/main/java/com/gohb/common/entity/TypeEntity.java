package com.gohb.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.gohb.common.utils.JsonLongSerializer;

import java.io.Serializable;

/**
 * type类型
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TypeEntity extends Model<TypeEntity> {

    private static final long serialVersionUID = 1L;

    @JsonSerialize(using = JsonLongSerializer.class )
    @TableId(value = "type_id")
    private Long typeId;

    private String typeName;

    @Override
    protected Serializable pkVal() {
        return this.typeId;
    }

}
