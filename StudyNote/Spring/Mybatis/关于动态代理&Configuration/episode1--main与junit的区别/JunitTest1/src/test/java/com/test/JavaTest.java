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
        System.out.println("�����ڲ���");
    }


    @After
    public void printMessageAfter(){
        JunitTest junitTest = new JunitTest();
        junitTest.printMessage1();
        System.out.println("�һ��ڲ��Է���֮��ִ��");
    }
}
