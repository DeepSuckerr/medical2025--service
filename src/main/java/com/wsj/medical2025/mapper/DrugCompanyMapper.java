package com.wsj.medical2025.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wsj.medical2025.dto.DrugCompanyDTO;
import com.wsj.medical2025.pojo.BasePojo;
import com.wsj.medical2025.pojo.DrugCompany;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugCompanyMapper extends BaseMapper<DrugCompany> {


    List<DrugCompany> getCompanyAll(DrugCompanyDTO drugCompanyDTO);


}
