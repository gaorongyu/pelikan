
package com.fngry.pelikan.conf.boot;

import com.fngry.pelikan.conf.env.EnvConf;
import com.fngry.pelikan.conf.env.impl.EnvConfImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// for starter
//@Configuration
public class AutoConfiguration {

//    @Bean
    public EnvConf initEnvConf() {
        return new EnvConfImpl();
    }

}
