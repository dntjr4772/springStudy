package com.example.study.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
public class SpELService {
    @Value("#{externalService.apiName eq 'kakao'}")
    private String spelName;
}
