package com.example.IoC_and_DI.config_only_java_code;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.IoC_and_DI")
@PropertySource("classpath:app.properties")
public class MyConfig {

}
