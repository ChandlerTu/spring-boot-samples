package com.chandlertu.spring.boot.samples.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({ PropertiesProperties.class, PropertiesListProperties.class,
    YmlProperties.class, YmlListProperties.class })
public class PropertiesConfiguration {

}
