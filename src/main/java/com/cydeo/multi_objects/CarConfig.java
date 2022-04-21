package com.cydeo.multi_objects;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CarConfig {

    @Bean(name="c1")

    Car c1() { // a method that returns us a car object
        Car c = new Car();
        c.setMake("BMW");
     return c;
    }

    @Bean //(name="c1")
    @Primary
    Car c2() { // a method that returns us a car object
        Car c = new Car();
        c.setMake("Tesla");
        return c;
    }
}
