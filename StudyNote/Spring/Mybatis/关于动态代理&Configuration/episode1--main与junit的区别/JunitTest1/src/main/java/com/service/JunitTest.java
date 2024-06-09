package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration�൱��һ�������bean.xml�ļ�(ʹ�ú�Ὣ������е�����@Bean���ض��������������),Component����
@Configuration(/*proxyBeanMethods = false���������ķ���������������(�������bean��bean)*/) //Ҳ������lite mode()��@Component()������ͬ
public class JunitTest {
    @Bean
    public void printMessage1(){
        System.out.println("���Ǵ�ӡ��Ϣ����1");
    }

    @Bean
    public void printMessage2(){
        System.out.println("���Ǵ�ӡ��Ϣ����2");
    }

    //���������õ�@Bean����@Configuration���س�Ϊ��������Bean��bean.xml�ļ�
    //�������¹涨:
    //@Configuration ָʾһ��������һ������@Bean���������ҿ�����Spring����������������ʱ����bean�������Щbean�ķ�������
    //@Component ��ʾ��ע�͵�����һ�������������ʹ�û���ע�͵����ú���·��ɨ��ʱ�����౻��Ϊ�Զ����ĺ�ѡ�ࡣ
    //@Configuration ʹ�� @Component ����Ԫע�ͣ���� @Configuration �������ɨ��ĺ�ѡ��
    //@Configuration Ҳ��һ�� @Component���� @Component ������ @Configuration ����������

    //��@Configuration(�п�������proxyBeanMethods = false���������ʧЧ,��ʱ@Bean���صĶ������Ϊ����),
    //����ʹ�õĴ���ģʽ�����JDK��̬(�ӿ�)����


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
