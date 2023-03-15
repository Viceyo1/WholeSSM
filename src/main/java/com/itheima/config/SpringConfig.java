package com.itheima.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(value = "com.itheima.service")
@PropertySource({"classpath:jdbc.properties"})
@Import({MybatisConfig.class,JdbcConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
