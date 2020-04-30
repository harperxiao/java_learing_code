package com.hp.demo5;

import com.hp.demo5.Person;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Myanno {
    int value();
    Person per();
    MyAnno2 anno2();
    String[] strs();
    String name() default "张三";

}
