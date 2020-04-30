package cn.hp.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();

        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        String realPath = servletContext.getRealPath(contextConfigLocation);

        try {
            FileInputStream fis = new FileInputStream(realPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("servletcontext对象创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servletcontext对象销毁");

    }
}
