package com.nokekang.democors.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description TODO
 * @Author sunjiankang
 * @Date 2019/6/24 15:17
 */
@Configuration
public class CorsFilterConfig {

    @Autowired
    private CorsConfigProperties corsConfigProperties;

    @Bean
    public CorsFilter corsConfig(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",buildCorsConfiguration());// controller接口配置，对所有接口配置跨域设置
//        source.registerCorsConfiguration("/user/get-all-users",buildCorsConfiguration());// controller接口配置，对所有接口配置跨域设置
        return new CorsFilter(source);
    }

    private CorsConfiguration buildCorsConfiguration(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(corsConfigProperties.getAllowCredentials());// 是否支持安全证书
        corsConfiguration.addAllowedHeader(corsConfigProperties.getAllowedHeaders());// 允许任何头
        corsConfiguration.addAllowedMethod(corsConfigProperties.getAllowedMethods());// 允许任何方法（post、get等）
        corsConfiguration.addAllowedOrigin(corsConfigProperties.getAllowedOrigins());// 允许任何域名使用
        corsConfiguration.setMaxAge(corsConfigProperties.getMaxAge());// 预检请求的有效期，单位为秒。
        return corsConfiguration;
    }

}
