package com.adc2018.bpmhw3.config;


import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public SpringFormEncoder feignFormEncoder() {
        return new SpringFormEncoder();
    }

}
