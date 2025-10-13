package com.wsj.medical2025.service;

import com.wsj.medical2025.commons.JSONResult;
import com.wsj.medical2025.dto.DrugCompanyDTO;
import com.wsj.medical2025.pojo.DrugCompany;

import java.util.List;

public interface DrugCompanyService {
    JSONResult getCompanyAll(DrugCompanyDTO drugCompanyDTO);

    JSONResult addCompany(DrugCompanyDTO drugCompanyDTO);

    JSONResult deleteCompany(Long companyId);

    JSONResult updateCompany(DrugCompanyDTO drugCompanyDTO);
}
