package com.haner.study.logic;

import com.haner.study.annotation.MyAnnotation;
import java.lang.reflect.Method;

public class MyAnnotationTest {
    @MyAnnotation
    public void doSomething(){
        System.out.println("hello world");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = MyAnnotationTest.class.getMethod("doSomething", null);
        if(method.isAnnotationPresent(MyAnnotation.class)){
            //如果doSomething方法上存在注解@MyAnnotation，则为true
            System.out.println(method.getAnnotation(MyAnnotation.class));
        }
    }
}
