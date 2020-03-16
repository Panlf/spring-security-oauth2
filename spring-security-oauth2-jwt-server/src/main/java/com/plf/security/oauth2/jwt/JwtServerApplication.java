package com.plf.security.oauth2.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Panlf
 * @date 2020/3/16
 */
@SpringBootApplication
public class JwtServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtServerApplication.class,args);
    }

    /**
     * 定义加密器
     * @return
     */
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
