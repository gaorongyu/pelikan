package com.fngry.pelikan.conf.env.impl;

import com.fngry.pelikan.conf.env.EnvConf;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.function.Consumer;

public class EnvConfImpl implements EnvConf {

    @Value("${env.own.sign}")
    private String envOwnSign;

    private ENV env = ENV.UNKNOWN;

    @PostConstruct
    public void init() {
        this.env = ENV.valueOf(envOwnSign);
        // load config items

    }

    @Override
    public boolean isProProduct() {
        return this.env == ENV.PRE_PRODUCT;
    }

    @Override
    public boolean isProduct() {
        return this.env == ENV.PRODUCT;
    }

    @Override
    public ENV get() {
        return this.env;
    }

    @Override
    public String get(String groupId, String configItem) {
        return null;
    }

    @Override
    public void listen(String groupId, String configItem, Consumer consumer) {

    }

}
