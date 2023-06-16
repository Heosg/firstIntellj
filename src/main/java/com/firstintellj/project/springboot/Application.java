package com.firstintellj.project.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//메인 클래스가 됨 이클래스는 항상 최상단에 위치해야함 , @srpingbootapplication이 있는 위치부터 설정을 읽어감
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}



