package com.wsj.medical2025.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("account")
@Accessors(chain = true)
public class Account extends BasePojo implements Serializable {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String uname;
    private String pwd;
    private String phoneNumber;
    private String uType;   //ROLE_1管理员、ROLE_2医生、ROLE_3患者
    private String realName;//真实姓名

}







