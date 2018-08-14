package com.fngry.pelikan.plugin.boot;

import com.fngry.pelikan.plugin.PluginManagerHolder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PluginManagerAutoConfiguration {

    @Bean
    public PluginManagerHolder pluginManagerHolder() {
        return new PluginManagerHolder();
    }

}
