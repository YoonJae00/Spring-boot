package com.ohgiraffers.autoconfiguration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
@ComponentScan("com.ohgiraffers.autoconfiguration")
public class SpringConfiguration {

    @Value("${test.value}") // application.properties value 값은 string 값
    private String value;

    @Value("${test.list}")
    private String[] list;

    @Value("${test.greeting}")
    private String greeting;

    @Value("${test.array}")
    private String[] array;

    @Value("${username}")
    private String username;

    @Bean
    public Object propertyReadTest() {

        System.out.println("value = " + value);

//        for (String list1 : list){
//            System.out.println(list1);
//        }

//        System.out.println("list = " + list);

        Arrays.stream(list).forEach(System.out::println);

        System.out.println("greeting = " + greeting);

        Arrays.stream(array).forEach(System.out::println);

        System.out.println("username = " + username);       // 시스템 -> 프로퍼티 -> yml 순으로

        return new Object();
    }
}
