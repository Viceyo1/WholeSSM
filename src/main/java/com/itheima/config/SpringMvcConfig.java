package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * =========================整合配置===============================================
 */
@Configuration
@ComponentScan({"com.itheima.controller","com.itheima.config"})
@EnableWebMvc

/**
 * =========================整合配置===============================================
 */

//@Configuration
//@ComponentScan({"com.itheima.controller","com.itheima.config"})
//@EnableWebMvc


public class SpringMvcConfig {
}
