package com.mume.Module_1_JavaSE_Basic.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation {
    public String value() default "123";
    public String value2();
}
