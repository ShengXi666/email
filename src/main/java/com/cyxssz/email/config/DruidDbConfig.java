package com.cyxssz.email.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * DruidDbConfig数据源配置
 * @author shengxi
 * @email ride0623@qq.com
 * @date 2019/8/30 11:47
 */

public class DruidDbConfig {
    private Logger logger= LoggerFactory.getLogger(DruidDbConfig.class);

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DruidDataSource dataSource(){
        return new DruidDataSource();
    }
}
