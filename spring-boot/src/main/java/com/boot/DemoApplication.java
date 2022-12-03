package com.boot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starter.bean.DemoStarterProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private DemoStarterProperties demoStarterProperties;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }


    @Override
    public void run(String... args) throws Exception {
        System.err.printf("ip = %s, port = %s", demoStarterProperties.getIp(), demoStarterProperties.getPort());
    }
}
