package com.wsj.medical2025.controller;

import com.wsj.medical2025.commons.JSONResult;
import com.wsj.medical2025.dto.DrugCompanyDTO;
import com.wsj.medical2025.pojo.DrugCompany;
import com.wsj.medical2025.service.DrugCompanyService;
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
public class DrugCompanyController {

    @Autowired
    private DrugCompanyService drugCompanyService;

    @GetMapping("/getCompanyAll")
    public JSONResult getCompanyAll(DrugCompanyDTO drugCompanyDTO) {
        return drugCompanyService.getCompanyAll(drugCompanyDTO);
    }

    @PostMapping("/addCompany")
    @CrossOrigin
    public JSONResult addCompany(@RequestBody DrugCompanyDTO drugCompanyDTO) {
        return drugCompanyService.addCompany(drugCompanyDTO);
    }

    @PostMapping("/deleteCompany")
    @CrossOrigin
    public JSONResult deleteCompany(Long companyId) {
        return drugCompanyService.deleteCompany(companyId);
    }
}
