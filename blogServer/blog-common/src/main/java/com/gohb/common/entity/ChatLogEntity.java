package com.gohb.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
 * 聊天消息记录 实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ChatLogEntity extends Model<ChatLogEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 消息id
     */
    @TableId(value = "msg_id")
    @JsonSerialize(using = JsonLongSerializer.class)
    private Long msgId;

    /**
     * 发送者 uuid
     */
    private Long sender;

    /**
     * 接收者uuid
     */
    private Long receiver;

    /**
     * 发送消息的时间
     */
    @TableField("`create_time`")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime createTime;

    /**
     * 消息内容
     */
    private String content;


    @Override
    protected Serializable pkVal() {
        return this.msgId;
    }

}
