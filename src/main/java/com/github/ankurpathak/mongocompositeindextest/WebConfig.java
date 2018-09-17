package com.github.ankurpathak.mongocompositeindextest;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {


    @Override
    protected void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

    }
}
