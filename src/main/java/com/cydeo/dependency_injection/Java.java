package com.cydeo.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class Java {

    OfficeHours officeHours; // dependency injection here

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
    public void getTeachingHours() {
            System.out.println("weekly teaching hours for Java : " + (40+" hours + office hours : " + officeHours.getHours()) );
        }
    }

