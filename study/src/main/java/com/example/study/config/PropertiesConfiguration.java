package com.example.study.config;

import com.example.study.domain.ConstructorProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;



@Configuration
@EnableConfigurationProperties(value = {ConstructorProperties.class})
public class PropertiesConfiguration {
}
