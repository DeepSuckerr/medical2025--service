package com.wsj.medical2025.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("role_permission")
public class RolePermission {


    @TableId(type = IdType.AUTO)
    private Integer id;
    private String roleName;
    private String perId;



}
