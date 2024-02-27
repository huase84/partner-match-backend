package com.th.partnermatchcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.th.partnermatchcloud.mapper")
@SpringBootApplication
public class PartnerMatchCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartnerMatchCloudApplication.class, args);
    }

}
