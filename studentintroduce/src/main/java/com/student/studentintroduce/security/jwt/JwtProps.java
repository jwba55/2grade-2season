package com.student.studentintroduce.security.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("com.student.studentintroduce")
public class JwtProps {
    private String secretKey;
}