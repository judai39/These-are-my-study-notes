package com;

import com.service.JunitTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(JunitTest.class);
        context.refresh();
        JunitTest test=context.getBean(JunitTest.class);
//        test.printMessage1();
        System.out.println(test.returnPersonBean());
        System.out.println(test.returnPersonBean());
        System.out.println(test.returnPerson());
        System.out.println(test.returnPerson());

    }
}
