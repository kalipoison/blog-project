package com.gohb.common.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;
import com.gohb.common.utils.JsonLongSerializer;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 好友实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class FriendsEntity extends Model<FriendsEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户本人的id
     */
    @JsonSerialize(using = JsonLongSerializer.class)
    private Long uid;

    /**
     * 用户好友的id
     */
    @JsonSerialize(using = JsonLongSerializer.class)
    private Long friendId;

    /**
     * 添加好友的时间
     */
    @TableField("`create_time`")
    @DateTimeFormat(pattern = "MM-dd HH:mm")
    @JsonFormat(pattern = "MM-dd HH:mm", timezone = "GMT+8")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
