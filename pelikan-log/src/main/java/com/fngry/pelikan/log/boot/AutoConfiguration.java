package com.fngry.pelikan.log.boot;

import com.fngry.pelikan.log.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfiguration {

    @Bean
    public LogBeanPostProcessor digest() {
        return new LogBeanPostProcessor(new DigestInterceptor());
    }

    @Bean
    public LogBeanPostProcessor logging() {
        return new LogBeanPostProcessor(new LoggingInterceptor());
    }

//    @Bean
//    public LogAutoProxyCreator logAutoProxyCreator() {
//        return new LogAutoProxyCreator();
//    }

}
