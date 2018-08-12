package com.fngry.pelikan.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.beans.BeansException;

import java.lang.annotation.Annotation;

public class LogAutoProxyCreator extends AbstractAutoProxyCreator {

    private static final MethodInterceptor DIGEST = new DigestInterceptor();

    private static final MethodInterceptor LOGGING = new LoggingInterceptor();

    public LogAutoProxyCreator() {
        super();
        setProxyTargetClass(true);
    }

    @Override
    protected Object[] getAdvicesAndAdvisorsForBean(Class<?> aClass, String s, TargetSource targetSource) throws BeansException {
        Annotation annotation = aClass.getAnnotation(LogAutoProxy.class);
        if (annotation == null) {
            return null;
        }
        Object[] specifics = new Object[] {DIGEST, LOGGING};
        return specifics;
    }

}
