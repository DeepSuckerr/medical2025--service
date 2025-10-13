package com.wsj.medical2025.config;

<<<<<<< HEAD
public class SwaggerConfig {
=======
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI docsOpenApi(){
        return new OpenAPI().info(new Info().title("SpringCloud").description("通用设计RestFull的接口文档").version("v1.0"))
                .externalDocs(new ExternalDocumentation()
                        .description("微服务接口文档").url("https://www.baidu.com/"));

    }

    @Bean
    public GroupedOpenApi accountApi(){
        return GroupedOpenApi.builder().group("用户登录模块")
                .pathsToMatch("/user/**").build();
    }

    @Bean
    public GroupedOpenApi dorterApi2(){
        return GroupedOpenApi.builder().group("医生管理模块")
                .pathsToMatch("/dorter/**").build();
    }


    @Bean
    public GroupedOpenApi orderApi() { // 创建了一个api接口的分组
        return GroupedOpenApi.builder()
                .group("订单模块") // 分组名称
                .pathsToMatch("/order/*") // 接口请求路径规则
                .build();
    }
>>>>>>> 5d5737f4adebe56990a33c8ecb9f9a6789ddc09b




}
