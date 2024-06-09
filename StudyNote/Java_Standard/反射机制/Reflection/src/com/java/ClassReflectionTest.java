package com.java;

import com.source_class.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class dogClass=Class.forName("com.source_class.Dog");
        Constructor constructor=dogClass.getConstructor(String.class);
        Object bob = constructor.newInstance("bob");
        Method method=dogClass.getMethod("getName");
        System.out.println(method.invoke(bob)); //method.invoke(methodAccessor,����[]) return methodAccessor.invoke(����[])
        /**�����Ƿ������������*/
        System.out.println(constructor);    //public com.source_class.Dog(java.lang.String)
        System.out.println(bob);            //com.source_class.Dog@74a14482 ����
        //��������,ԭ��ֱ��ʵ����������ݲ���ֳɼ�������,ǰ��Թ�Ҫ���ݺ���ľ��Ӵ��ݸ���һ�澵��,��˽�������
        //������ʹ��ʵ��������������,����������㹻���Ӳ�Ļ���
        //����:
        Class personClass=Class.forName("com.source_class.Person");
        Constructor constructorPerson=personClass.getConstructor(String.class,int.class);
        Object person = constructorPerson.newInstance("������", 3);
        Method methodPlay=personClass.getMethod("playWithDog", Dog.class);
        methodPlay.invoke(person,bob);//invoke(�ص�����,����args[])
    }
}


