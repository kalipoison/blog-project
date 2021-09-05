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
import org.springframework.format.annotation.DateTimeFormat;
import com.gohb.common.utils.JsonLongSerializer;

import java.time.LocalDateTime;

/**
 * 群聊实体类
 */
@Data
public class GroupChatEntity extends Model<GroupChatEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 消息id
     */
    @TableId(value = "msg_id")
    @JsonSerialize(using = JsonLongSerializer.class)
    private Long msgId;

    /**
     * 用户id
     */
    @JsonSerialize(using = JsonLongSerializer.class)
    private Long uid;

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

    /**
     * 群聊id
     */
    private Integer roomId;

}
