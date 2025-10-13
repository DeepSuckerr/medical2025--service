package com.wsj.medical2025.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CrossOriginConfig implements WebMvcConfigurer {


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:9091") // 显式指定域名
                .allowCredentials(true) // 允许凭证
                .allowedMethods("*")
                .allowedHeaders("*")
                .maxAge(3600);// 预检请求  浏览器发的请求
    }

}
