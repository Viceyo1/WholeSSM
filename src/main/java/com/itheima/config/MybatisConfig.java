package com.itheima.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class MybatisConfig {

    /**
     * =========================整合配置===============================================
     */

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setTypeAliasesPackage("com.itheima.domain");
        bean.setDataSource(dataSource);
        return bean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.itheima..dao");
        return msc;
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }


    /**
     * =========================整合配置===============================================
     */

//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setTypeAliasesPackage("com.itheima.domain");
//        bean.setDataSource(dataSource);
//        return bean;
//    }
//
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        MapperScannerConfigurer msc = new MapperScannerConfigurer();
//        msc.setBasePackage("com.itheima..dao");
//        return msc;
//    }
//
//    @Bean
//    public PlatformTransactionManager platformTransactionManager(DataSource dataSource){
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//        transactionManager.setDataSource(dataSource);
//        return transactionManager;
//    }

}
