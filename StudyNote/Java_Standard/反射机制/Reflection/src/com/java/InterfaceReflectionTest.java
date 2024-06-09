package com.java;

import com.source_class.AnimalDisplay;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**反射接口,可实现动态代理,可生成一个接口的"实例"*/
public class InterfaceReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        //根据类返回接口
//        Class dogClass = Class.forName("com.java.DogDisplay");
//        Class[] interfaceAnimal = dogClass.getInterfaces();//注意getInterfaces()返回值是一个数组
//        for (int i=0;i<interfaceAnimal.length;i++){
//            System.out.println(interfaceAnimal[i]);
//        }
//
//        ProxyDisplay proxyDisplay = new ProxyDisplay();
//        proxyDisplay.proxyFoundation();
    }
}


//存疑代码
//class DogDisplay implements AnimalDisplay{
//    @Override
//    public void display() {
//        System.out.println("小狗登场");
//    }
//}
//class ProxyDisplay{
//    public void proxyFoundation() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
//        Class animalInterface=Class.forName("com.java.DogDisplay");
//        Object newInstance = animalInterface.getConstructor().newInstance();
//        Method method=animalInterface.getMethod("display");
//        method.invoke(newInstance);
//    }
//}