package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");

        // Retrieving and printing Samosa bean
        Samosa s = (Samosa) context.getBean("s1");
        System.out.println(s);

        // Registering a shutdown hook to call destroy method
        ((AbstractApplicationContext) context).registerShutdownHook();

        System.out.println("*******************************************");

        // Retrieving and printing Pepsi bean
        Pepsi p = (Pepsi) context.getBean("p1");
        System.out.println(p);

        // Retrieving and printing Example bean
        Example e = (Example) context.getBean("e1");
        System.out.println(e);

    }

}
