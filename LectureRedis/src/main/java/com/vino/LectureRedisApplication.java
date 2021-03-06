package com.vino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class LectureRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LectureRedisApplication.class, args);
    }
}
