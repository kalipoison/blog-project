package com.gohb.common.bo;

import com.gohb.common.entity.ChatLogEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class ChatLogBo extends ChatLogEntity implements Serializable{
    private Integer type;
}
