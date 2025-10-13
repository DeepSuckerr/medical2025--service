package com.wsj.medical2025.service.impl;

import com.wsj.medical2025.commons.JSONResult;
import com.wsj.medical2025.mapper.PermissionMapper;
import com.wsj.medical2025.pojo.RolePermission;
import com.wsj.medical2025.service.PermissionService;
import com.wsj.medical2025.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionMapper permissionMapper;


    @Override
    public JSONResult getPermissionsByRoleName(String roleName) {

        if (roleName == null || "".equals(roleName)) {
            return new JSONResult(201,"没有角色名称",null);
        }

        List<Permission> permissions = permissionMapper.getPermissionsByRoleName(roleName);
        if (permissions == null || permissions.isEmpty()) {
            return new JSONResult(202,"查询失败",null);
        }else {
            return new JSONResult(200,"查询成功",permissions);
        }

    }


}
