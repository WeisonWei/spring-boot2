package com.wxx.sb.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.beans.PropertyVetoException;

@Configuration
public class DruidDBConfig {
    @Autowired
    private Environment env;

    @Bean(name = "dataSource")
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("ms.db.url"));
        dataSource.setDriverClassName(env.getProperty("ms.db.driverClassName"));
        dataSource.setPassword(env.getProperty("ms.db.password"));
        dataSource.setUsername(env.getProperty("ms.db.username"));
        //执行前看连接是否可用
        dataSource.setTestOnBorrow(true);
        return dataSource;
    }

}




