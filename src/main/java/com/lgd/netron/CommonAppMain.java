package com.lgd.netron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Project: samples-all</p>
 * <p>Package: com.lgd.es</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/6/15
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.lgd.netron"})
@Configuration
@ServletComponentScan
@EnableScheduling
@EnableAsync // 启动异步调用
@RestController
public class CommonAppMain {

    // http://localhost:8080/api/v1/anno/text
    public static void main(String[] args) {
        SpringApplication.run(CommonAppMain.class, args);
    }



    @GetMapping("/hello")
    public String hello(){
        return  "hello";
    }


}
