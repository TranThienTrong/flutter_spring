package com.trong.flutterbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class FlutterBackendApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FlutterBackendApplication.class);
        application.run(args);
    }


}
