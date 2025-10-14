package com.wsj.medical2025.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wsj.medical2025.pojo.DrugCompany;

import java.util.List;

public interface DrugCompanyMapper extends BaseMapper<DrugCompany> {


    List<DrugCompany> getCompanyAll(String drugCompanyDTO);


}
