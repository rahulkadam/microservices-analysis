package com.trianz.BALENQ.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mip")
@Data
public class MIPProperties {
    private String url;
}
