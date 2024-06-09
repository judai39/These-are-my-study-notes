package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration相当于一个特殊的bean.xml文件(使用后会将标记类中的所有@Bean返回对象添加至容器中),Component则不行
@Configuration(/*proxyBeanMethods = false如此声明后的方法不会代理代理方法(不会产生bean中bean)*/) //也被称作lite mode()与@Component()作用相同
public class JunitTest {
    @Bean
    public void printMessage1(){
        System.out.println("我是打印信息方法1");
    }

    @Bean
    public void printMessage2(){
        System.out.println("我是打印信息方法2");
    }

    //在这里配置的@Bean对象被@Configuration加载成为了配置了Bean的bean.xml文件
    //现有如下规定:
    //@Configuration 指示一个类声明一个或多个@Bean方法，并且可以由Spring容器处理以在运行时生成bean定义和这些bean的服务请求
    //@Component 表示带注释的类是一个“组件”。当使用基于注释的配置和类路径扫描时，此类被视为自动检测的候选类。
    //@Configuration 使用 @Component 进行元注释，因此 @Configuration 类是组件扫描的候选类
    //@Configuration 也是一个 @Component，但 @Component 不能像 @Configuration 那样工作。

    //在@Configuration(中可以声明proxyBeanMethods = false令代理能力失效,此时@Bean返回的对象均不为单例),
    //这里使用的代理模式变成了JDK动态(接口)代理


    @Bean
    public Person returnPersonBean(){
        return new Person();
    }

//    @Bean
    public Person returnPerson(){
        return new Person();
    }
}
class Person{
}
