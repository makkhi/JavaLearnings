package com.learn.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

/**
 * Reads configuration values related to Catalog Configuration Platform's
 */
@Component
@PropertySource("classpath:com/amazon/ccqs/datasourcing/ump/config/UMPDataSourcing.properties")
public class Example {

    public static final int MAX_RETRIES = 3;
    public static final int MIN_RETRIES = 1;

    @Value("${CCP_ENDPOINT}")
    private String endpoint;
    @Value("${CCP_CONFIG_LABEL}")
    private String configLabel;
    @Value("${CCP_VERSION}")
    private String version;
    @Value("${DENORMALIZED_API_PROFILE}")
    private String denormalizeApiProfile;

    private Integer ccpApiRetry = 1;

    //To resolve ${} in @Value
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }


}
