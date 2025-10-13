package com.wsj.medical2025.controller;

import com.wsj.medical2025.commons.JSONResult;
import com.wsj.medical2025.dto.DrugCompanyDTO;
import com.wsj.medical2025.pojo.DrugCompany;
import com.wsj.medical2025.service.DrugCompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drugCompany")
@CrossOrigin
@Tag(name = "制药公司模块",description = "这个是制药公司的操作接口")
public class DrugCompanyController {

    @Autowired
    private DrugCompanyService drugCompanyService;

    @GetMapping("/getCompanyAll")
    @Operation(summary = "获取制药公司",description = "获取全部制药公司")
    public JSONResult getCompanyAll(DrugCompanyDTO drugCompanyDTO) {
        return drugCompanyService.getCompanyAll(drugCompanyDTO);
    }

    @PostMapping("/addCompany")
    @CrossOrigin
    @Operation(summary = "添加制药公司",description = "添加制药公司")
    public JSONResult addCompany(@RequestBody DrugCompanyDTO drugCompanyDTO) {
        return drugCompanyService.addCompany(drugCompanyDTO);
    }

    @PostMapping("/deleteCompany")
    @CrossOrigin
    @Operation(summary = "删除制药公司",description = "根据id删除制药公司")
    public JSONResult deleteCompany(Long companyId) {
        return drugCompanyService.deleteCompany(companyId);
    }

    @PostMapping("/updateCompany")
    @CrossOrigin
    @Operation(summary = "更新制药公司",description = "根据id更新制药公司")
    public JSONResult updateCompany(@RequestBody DrugCompanyDTO drugCompanyDTO) {
        return drugCompanyService.updateCompany(drugCompanyDTO);
    }






}
