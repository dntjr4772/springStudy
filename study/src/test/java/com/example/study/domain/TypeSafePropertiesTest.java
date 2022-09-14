package com.example.study.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TypeSafePropertiesTest {

    @Autowired
    private TypeSafeProperties typeSafeProperties;

    @DisplayName("ConfigurationProperties 를 이용한 properties bind")
    @Test
    void valueBindTest() {
        assertThat(typeSafeProperties.getApi().getName()).isEqualTo("lgcns");
        assertThat(typeSafeProperties.getApi().getKey()).isEqualTo(123123);
    }
}