package com.wsj.medical2025.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(title = "用户登录封装数据")
public class AccountDTO implements Serializable {

    @Schema(title = "封装用户id")
    private Long id;
    @Schema(title = "封装用户用户名")
    private String uname;
    @Schema(title = "封装用户密码")
    private String pwd;
    @Schema(title = "封装用户电话号码")
    private String phoneNumber;
    @Schema(title = "封装用户类型")
    private String uType;
    @Schema(title = "封装用户真实姓名")//ROLE_1管理员、ROLE_2医生、ROLE_3患者
    private String realName;//真实姓名
    @Schema(title = "token值")
    private String token;


}
