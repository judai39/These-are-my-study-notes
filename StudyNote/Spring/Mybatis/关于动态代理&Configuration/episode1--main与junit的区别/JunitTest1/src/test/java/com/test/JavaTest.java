package com.test;

import com.service.JunitTest;
import org.junit.After;
import org.junit.Test;

public class JavaTest {
    @Test
    public void printMessage(){
        JunitTest junitTest = new JunitTest();
        junitTest.printMessage1();
        junitTest.printMessage2();
        System.out.println("我正在测试");
    }


    @After
    public void printMessageAfter(){
        JunitTest junitTest = new JunitTest();
        junitTest.printMessage1();
        System.out.println("我会在测试方法之后执行");
    }
}
