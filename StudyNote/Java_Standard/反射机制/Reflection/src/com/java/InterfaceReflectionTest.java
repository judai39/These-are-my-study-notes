package com.java;

import com.source_class.AnimalDisplay;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**����ӿ�,��ʵ�ֶ�̬����,������һ���ӿڵ�"ʵ��"*/
public class InterfaceReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        //�����෵�ؽӿ�
//        Class dogClass = Class.forName("com.java.DogDisplay");
//        Class[] interfaceAnimal = dogClass.getInterfaces();//ע��getInterfaces()����ֵ��һ������
//        for (int i=0;i<interfaceAnimal.length;i++){
//            System.out.println(interfaceAnimal[i]);
//        }
//
//        ProxyDisplay proxyDisplay = new ProxyDisplay();
//        proxyDisplay.proxyFoundation();
    }
}


//���ɴ���
//class DogDisplay implements AnimalDisplay{
//    @Override
//    public void display() {
//        System.out.println("С���ǳ�");
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