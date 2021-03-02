package com.oschina.testjenkins.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/8/31 9:45
 * @Version 1.0
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {

        ParameterBuilder parameterBuilder = new ParameterBuilder();
        parameterBuilder
                .name("authorization")
                .defaultValue("")
                .description("用于身份校验的token")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();



        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @SuppressWarnings("deprecation")
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("视频后台")
                .description("视频后台接口")
                .version("1.0")
                .build();
    }



    @Bean
    public ModelMapper init(){
        return new ModelMapper();
    }

}
