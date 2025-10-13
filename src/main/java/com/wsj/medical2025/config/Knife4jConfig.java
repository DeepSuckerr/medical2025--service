package com.wsj.medical2025.config;

import com.wsj.medical2025.commons.Swagger3Properties;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Knife4jConfig {

    private final Swagger3Properties swagger3Properties;

    public Knife4jConfig(Swagger3Properties swagger3Properties) {
        this.swagger3Properties = swagger3Properties;
    }

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info() // 基本信息配置
                        .title(swagger3Properties.getTitle()) // 标题
                        .description(swagger3Properties.getDescription()) // 描述Api接口文档的基本信息
                        .version(swagger3Properties.getVersion()) // 版本
                        .termsOfService(swagger3Properties.getTermsOfServiceUrl())
                        // 设置OpenAPI文档的联系信息，包括联系人姓名为"patrick"，邮箱为"patrick@gmail.com"。
                        .contact(new Contact().name(swagger3Properties.getName()).email(swagger3Properties.getEmail()))
                        // 设置OpenAPI文档的许可证信息，包括许可证名称为"Apache 2.0"，许可证URL为"http://springdoc.org"。
                        .license(new License().name("Apache 2.0").url("https://springdoc.org"))
                );
    }


}
