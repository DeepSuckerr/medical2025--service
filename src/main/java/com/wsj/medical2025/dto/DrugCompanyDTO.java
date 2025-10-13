package com.wsj.medical2025.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wsj.medical2025.pojo.BasePojo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Schema(title = "用于封装制药公司数据")
public class DrugCompanyDTO implements Serializable {

    private Long companyId;//公司id

    private String companyName;//公司名

    private String companyPhone;//公司电话
}
