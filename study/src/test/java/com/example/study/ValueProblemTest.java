package com.example.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ValueProblemTest {
    @Value("${external.value}")
    private String stringValue;

    @Value("${external.value}")
    private boolean booelanValue;

    @Test
    void problemTest() {
        assertThat(stringValue).isEqualTo("true");
        assertThat(booelanValue).isEqualTo(true);
    }
}
