package com.wsj.medical2025.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("permission")
public class Permission implements Serializable {


    @TableId(type = IdType.AUTO)
    private Integer id;//菜单id
    private Integer pid;//菜单父id
    private String name;//菜单name
    private String path;//菜单路径
    private String component;//菜单组件
    private Integer level;//菜单级别
    private String title;
    @TableField(exist = false)
    private List<Permission> children;//子菜单

}
