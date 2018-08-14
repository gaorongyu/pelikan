package com.fngry.pelikan.plugin;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import java.util.Collection;

/**
 * 插件容器 getBean()统一入口
 * Created by gaorongyu on 2017/11/6.
 */
public class PluginManagerHolder implements ApplicationContextAware, InitializingBean {

    private Collection<IPluginManager> pluginManagers;

    private ApplicationContext applicationContext;

    @PostConstruct
    public void init() {
        this.pluginManagers = applicationContext.getBeansOfType(IPluginManager.class).values();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        String[] beanNames = this.applicationContext.getBeanDefinitionNames();

        // for loop init plugins
        for (String beanName : beanNames) {
            Object bean = applicationContext.getBean(beanName);

            for (IPluginManager pluginManager : pluginManagers) {
                pluginManager.initPlugin(beanName, bean);
            }
        }
        // post init plugin
        for (IPluginManager pluginManager : pluginManagers) {
            pluginManager.postInitPlugin();
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public Collection<IPluginManager> getPluginManagers() {
        return this.pluginManagers;
    }

    public void addPluginManager(IPluginManager pluginManager) {
        this.pluginManagers.add(pluginManager);
    }

}
