package com.fngry.pelikan.log.boot;

import com.fngry.pelikan.log.LogAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfiguration {

//    @Bean
//    public LogBeanPostProcessor digest() {
//        return new LogBeanPostProcessor(new DigestInterceptor());
//    }

    @Bean
    public LogAutoProxyCreator logAutoProxyCreator() {
        return new LogAutoProxyCreator();
    }

}
