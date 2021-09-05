package com.gohb.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.gohb.common.utils.JsonLongSerializer;

import java.io.Serializable;

/**
 * 标签实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TagEntity extends Model<TagEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     */
    @JsonSerialize(using = JsonLongSerializer.class )
    @TableId(value = "tag_id")
    private Long tagId;

    /**
     * 标签名
     */
    private String tagName;


    @Override
    protected Serializable pkVal() {
        return this.tagId;
    }

}
