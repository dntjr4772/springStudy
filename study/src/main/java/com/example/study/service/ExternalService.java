package com.example.study.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
public class ExternalService {
    @Value("${external.year}")
    private String year;

    @Value("${external.api.name}")
    private String apiName;

    @Value("${external.api.key}")
    private Integer apiKey;
}