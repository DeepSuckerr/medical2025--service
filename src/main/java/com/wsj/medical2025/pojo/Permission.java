package com.wsj.medical2025.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.security.Permission;
import java.util.List;

public class Permission {

    @JsonIgnore
    private Integer id;//菜单id
    @JsonIgnore
    private Integer pid;//菜单父id
    private String path;//菜单路径
    private String name;//菜单name
    private String component;//菜单组件
    @JsonIgnore
    private Integer level;//菜单级别
    private List<Permission> children;//子菜单

}
