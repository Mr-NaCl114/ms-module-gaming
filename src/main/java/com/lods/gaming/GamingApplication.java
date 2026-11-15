package com.lods.gaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamingApplication {

    static void main(String[] args) {
        SpringApplication.run(GamingApplication.class, args);
        System.out.println("========================= Gaming Init Done =========================");
    }

}
