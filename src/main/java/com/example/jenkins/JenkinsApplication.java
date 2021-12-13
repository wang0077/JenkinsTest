package com.example.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
        log.info("Success");
    }

}
