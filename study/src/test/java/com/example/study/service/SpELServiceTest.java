package com.example.study.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpELServiceTest {

    @Value("#{1 eq 1}")
    private boolean spelBoolean;

    @Value("#{externalService.apiName}")
    private String spelName;

    @DisplayName("@Value 를 이용한 properties bind")
    @Test
    void valueBindTest() {
        assertThat(spelBoolean).isTrue();
        assertThat(spelName).isEqualTo("lgcns");
    }
}