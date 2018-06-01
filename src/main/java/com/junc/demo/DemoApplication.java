package com.junc.demo;

import org.mybatis.spring.annotation.MapperScan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@MapperScan(basePackages = "com.junc.demo.dao")
//扫描druid监控filter和servlet
@ServletComponentScan

/**
 * @author 项目启动类
 */
public class DemoApplication {

    private Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
