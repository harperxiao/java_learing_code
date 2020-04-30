package com.hp.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect//表示当前类是一个切面类
public class Logger {

    @Pointcut("execution(* com.hp.service.impl.*.*(..))")
    private void pt1(){}

    public void beforePrintLog(){
        System.out.println("前置");
    }
    public void afterReturnPrintLog(){
        System.out.println("后置");
    }

    public  void afterThrowingPrintLog(){
        System.out.println("异常通知Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
    }

    /**
     * 最终通知
     */
    public void afterPrintLog(){
        System.out.println("最终通知Logger类中的afterPrintLog方法开始记录日志了。。。");
    }

    @Around("pt1()")
    public Object around(ProceedingJoinPoint pjp){
        try {
            Object rtvalue = null;
            Object[] args = pjp.getArgs();
            System.out.println("arond前置");
            rtvalue = pjp.proceed(args);
            System.out.println("around后");

            return rtvalue;
        } catch (Throwable t) {
            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。异常");
            throw new RuntimeException(t);
        }finally {
            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。最终");

        }
    }

}
