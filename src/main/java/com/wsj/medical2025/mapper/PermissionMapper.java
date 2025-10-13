package com.wsj.medical2025.mapper;

import com.wsj.medical2025.pojo.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {


    List<Permission> getPermissionsByRoleName(@Param("roleName") String roleName);



}
