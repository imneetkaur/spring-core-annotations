package com.stackroute;

import com.stackroute.config.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(BeanConfig.class);
        annotationConfigApplicationContext.refresh();

        Movie movie = (Movie) annotationConfigApplicationContext.getBean("movie");
        System.out.println(movie);

        /*Movie movie1 = (Movie) annotationConfigApplicationContext.getBean("movie1");
        System.out.println(movie1);*/

       /* if(movie == movie1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }*/


    }
}
