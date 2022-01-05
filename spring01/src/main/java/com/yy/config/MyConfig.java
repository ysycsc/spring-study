package com.yy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author shkstart
 * @create 2021-12-30 17:57
 */
@Configuration
@Import(MyConfig2.class)
public class MyConfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
