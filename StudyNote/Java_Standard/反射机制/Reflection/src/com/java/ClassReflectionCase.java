package com.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**反射允许程序在运行时对任意类对内部进行检查(包括构造器,成员)
 * -->目的:对于任意一个类都能知道这个类的所有属性和方法,对于任意一个对象,都能调用它的任意一个方法
 * -->缺点:浪费时间,空间,可能破坏封装性
 * */
public class ClassReflectionCase {
    public static void main(String[] args){
        try {
            // 加载并初始化Person类
            Class<?> personClass = Class.forName("com.source_class.Person");
            //还可以以下方法初始化
            //1.Class class2=Person.class;
            //2.Class class1=new Person("d",12).getClass();   调用getClass()不能自定义参数


            // 获取Person类的构造函数
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);

            // 使用构造函数创建Person对象
            Object personObj = constructor.newInstance("Alice", 25);

            // 获取并调用sayHello方法
            Method sayHelloMethod = personClass.getMethod("sayHello");
            sayHelloMethod.invoke(personObj);

            // 获取并调用getName方法
            Method getNameMethod = personClass.getMethod("getName");
            String name = (String) getNameMethod.invoke(personObj);
            System.out.println("Name: " + name);

            // 获取并调用getAge方法
            Method getAgeMethod = personClass.getMethod("getAge");
            int age = (int) getAgeMethod.invoke(personObj);
            System.out.println("Age: " + age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
