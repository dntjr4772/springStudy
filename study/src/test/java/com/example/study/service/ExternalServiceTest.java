package com.example.study.service;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ExternalServiceTest {
    @Autowired
    private ExternalService externalService;

    @DisplayName("@Value 를 이용한 properties bind")
    @Test
    void valueBindTest() {
        assertThat(externalService.getYear()).isEqualTo("2022");
        assertThat(externalService.getApiKey()).isEqualTo(123123);
        assertThat(externalService.getApiName()).isEqualTo("lgcns");
    }
}