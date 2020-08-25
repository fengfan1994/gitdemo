package com.fengfan;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 **/
@SpringBootApplication(scanBasePackages = "com.fengfan")
@MapperScan(annotationClass = Mapper.class,basePackages = "com.fengfan")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
