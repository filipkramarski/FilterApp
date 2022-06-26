package com.example.filterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class FilterAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterAppApplication.class, args);
    }

}
