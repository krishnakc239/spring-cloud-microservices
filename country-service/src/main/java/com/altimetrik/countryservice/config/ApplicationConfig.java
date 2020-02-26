package com.altimetrik.countryservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.xmlpull.v1.XmlPullParserException;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.io.IOException;

@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate getRestTeplate(){
        return  new RestTemplate();
    }

    @Bean
    public Docket api() throws IOException, XmlPullParserException {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.altimetrik.countryservice.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfo("Country Service Api Documentation", "Documentation automatically generated", "1.0.0", null, null, null, null));
    }

}
