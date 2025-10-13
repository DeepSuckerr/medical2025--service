package com.wsj.medical2025.controller;


import com.wsj.medical2025.commons.JSONResult;
import com.wsj.medical2025.service.PermissionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/permission")
@Tag(name = "权限模块",description = "权限功能")
@CrossOrigin
public class PermissionController {

    @Autowired
    PermissionService permissionService;

    @GetMapping("/getPermissions")
    @Operation(summary = "获取指定角色权限",description = "获取指定角色权限")
    public JSONResult getPermissions(@RequestParam("roleName") String roleName){
        return permissionService.getPermissionsByRoleName(roleName);
    }
}
