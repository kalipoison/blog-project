package com.gohb.common.bo;

import com.gohb.common.entity.GroupChatEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class GroupChatBo extends GroupChatEntity implements Serializable {
    private String avatar;  // 用户头像
    private String username;
    private String nickname;
    private Long uid;
    private Integer type;
}
