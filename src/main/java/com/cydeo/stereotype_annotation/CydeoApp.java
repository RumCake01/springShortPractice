package com.cydeo.stereotype_annotation;

import com.cydeo.bean_annotation.FullTimeMentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCourse.class);
        Java java = container.getBean(Java.class);
        java.getTeachingHours();

//        Selenium selenium = container.getBean(Selenium.class);
//        selenium.getTeachingHours();  this is failing because we did not provide @Component for this class since we dont want to create bean from that class

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount(); // we are able to create beans from classes that are outise of this project because provide basePackages in annotation in our config class




    }
}

