package com.gohb.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;
import com.gohb.common.utils.JsonLongSerializer;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户评论 实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommentEntity extends Model<CommentEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
    @JsonSerialize(using = JsonLongSerializer.class )
    @TableId(value = "comment_id")
    private Long commentId;

    /**
     * 用户的uid
     */
    private Long uid;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @com.baomidou.mybatisplus.annotations.TableField("`create_time`")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime createTime;

    /**
     * 博客id
     */
    @JsonSerialize(using = JsonLongSerializer.class )
    private Long blogId;

    /**
     * 上一条评论id
     */
    @JsonSerialize(using = JsonLongSerializer.class )
    private Long parentCommentId;

    /**
     * 与 user 表进行关联查询
     * 用户昵称
     */
    @TableField(exist = false)
    private String nickname;

    /**
     * 与 user 表进行关联查询
     * 用户头像
     */
    @TableField(exist = false)
    private String avatar;

    /**
     * 将不是根节点评论封装到list
     */
    @TableField(exist = false)
    private List<CommentEntity> children;

    @Override
    protected Serializable pkVal() {
        return this.commentId;
    }

}
