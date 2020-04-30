package com.hp.demo5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Pro(className = "com.hp.demo4.Human",methodName = "sayHello")
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<ReflectTest> reflectTestClass = ReflectTest.class;

        Pro an = reflectTestClass.getAnnotation(Pro.class);
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
