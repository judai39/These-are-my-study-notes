package com.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**�����������������ʱ����������ڲ����м��(����������,��Ա)
 * -->Ŀ��:��������һ���඼��֪���������������Ժͷ���,��������һ������,���ܵ�����������һ������
 * -->ȱ��:�˷�ʱ��,�ռ�,�����ƻ���װ��
 * */
public class ClassReflectionCase {
    public static void main(String[] args){
        try {
            // ���ز���ʼ��Person��
            Class<?> personClass = Class.forName("com.source_class.Person");
            //���������·�����ʼ��
            //1.Class class2=Person.class;
            //2.Class class1=new Person("d",12).getClass();   ����getClass()�����Զ������


            // ��ȡPerson��Ĺ��캯��
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);

            // ʹ�ù��캯������Person����
            Object personObj = constructor.newInstance("Alice", 25);

            // ��ȡ������sayHello����
            Method sayHelloMethod = personClass.getMethod("sayHello");
            sayHelloMethod.invoke(personObj);

            // ��ȡ������getName����
            Method getNameMethod = personClass.getMethod("getName");
            String name = (String) getNameMethod.invoke(personObj);
            System.out.println("Name: " + name);

            // ��ȡ������getAge����
            Method getAgeMethod = personClass.getMethod("getAge");
            int age = (int) getAgeMethod.invoke(personObj);
            System.out.println("Age: " + age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
