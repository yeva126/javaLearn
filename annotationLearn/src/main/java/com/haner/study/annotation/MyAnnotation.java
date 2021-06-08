package com.haner.study.annotation;

import java.lang.annotation.*;

/**
 * @author Iris
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {

}
