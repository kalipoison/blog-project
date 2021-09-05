package com.gohb.common.bo;

import com.gohb.common.entity.FriendsEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class FriendsBo extends FriendsEntity implements Serializable {
    private String username;
    private String nickname;
    private String avatar;
    private String lastContent;
    private Integer messageNum = 0; // 未读消息数量
}
