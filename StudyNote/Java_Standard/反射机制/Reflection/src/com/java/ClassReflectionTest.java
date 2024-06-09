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
        System.out.println(method.invoke(bob)); //method.invoke(methodAccessor,参数[]) return methodAccessor.invoke(参数[])
        /**以下是反射的作用体现*/
        System.out.println(constructor);    //public com.source_class.Dog(java.lang.String)
        System.out.println(bob);            //com.source_class.Dog@74a14482 单例
        //如你所见,原来直接实例化对象根据步骤分成几个部分,前面对光要根据后面的镜子传递给下一面镜子,因此叫做反射
        //正因反射使得实例化对象更加灵活,给程序加入足够多间接层的机会
        //例如:
        Class personClass=Class.forName("com.source_class.Person");
        Constructor constructorPerson=personClass.getConstructor(String.class,int.class);
        Object person = constructorPerson.newInstance("狗主人", 3);
        Method methodPlay=personClass.getMethod("playWithDog", Dog.class);
        methodPlay.invoke(person,bob);//invoke(回调对象,参数args[])
    }
}


