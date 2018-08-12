package com.fngry.pelikan.log;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface Logging {

    int DEBUG = 0;

    int INFO = 1;

    int value() default 0;

    boolean async() default false;

}
