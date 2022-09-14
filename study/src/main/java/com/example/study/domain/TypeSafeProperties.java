package com.example.study.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("external")
@Getter
@Setter
public class TypeSafeProperties {
    private String year;
    private Api api;

    @Getter
    @Setter
    public static class Api {
        private String name;
        private Integer key;
    }
}
