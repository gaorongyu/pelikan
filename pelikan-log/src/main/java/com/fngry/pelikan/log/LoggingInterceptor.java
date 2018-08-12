package com.fngry.pelikan.log;

import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class LoggingInterceptor extends LogInterceptor<Logging> {

    public LoggingInterceptor(Class<Logging> clazz) {
        super(clazz);
    }

    @Override
    protected Object invoke(MethodInvocation methodInvocation, Method specificMethod, Logging annotation) {
        return null;
    }

}
