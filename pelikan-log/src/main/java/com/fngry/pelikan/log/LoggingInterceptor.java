package com.fngry.pelikan.log;

import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class LoggingInterceptor extends LogInterceptor<Logging> {

    public LoggingInterceptor() {
        super(Logging.class);
    }

    @Override
    protected Object invoke(MethodInvocation methodInvocation, Method specificMethod, Logging annotation) {
        try {
            return methodInvocation.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}
