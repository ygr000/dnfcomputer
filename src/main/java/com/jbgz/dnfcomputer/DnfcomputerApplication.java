package com.jbgz.dnfcomputer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.jbgz.dnfcomputer")
@MapperScan(basePackages = "com.jbgz.dnfcomputer.mapper")
public class DnfcomputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DnfcomputerApplication.class, args);
    }

}
