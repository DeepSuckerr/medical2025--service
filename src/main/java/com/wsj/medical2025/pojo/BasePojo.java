package com.wsj.medical2025.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class BasePojo implements Serializable {

    protected Date updateTime;
    protected Date createTime;

}
