package com.wsj.medical2025.service;

import com.wsj.medical2025.commons.JSONResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface PermissionService {

    JSONResult getPermissionsByRoleName(@Param("roleName") String roleName);
}
