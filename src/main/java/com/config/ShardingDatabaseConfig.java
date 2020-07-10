package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.util.ObjectUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


//@Configuration
//@MapperScan({"com.sharding.module.mapper*" })
//@EnableConfigurationProperties({DataSourceProperties.class,  LiquibaseProperties.class ,MybatisProperties.class})
public class ShardingDatabaseConfig {

    private final DataSourceProperties dataSourceProperties;
    private final MybatisProperties properties;
    //private final YamlShardingRuleConfiguration yamlShardingRuleConfiguration;

    @Value("${spring.dbType:mysql}")
    private String dbType; // mysql或者oracle

    @Autowired
    private DataSource dataSource;

    public ShardingDatabaseConfig(DataSourceProperties dataSourceProperties, MybatisProperties properties) {
        this.dataSourceProperties = dataSourceProperties;
        this.properties=properties;
        //this.yamlShardingRuleConfiguration=yamlShardingRuleConfiguration;
    }

    @Bean
    public MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean() {
        MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        //mybatisSqlSessionFactoryBean.setDataSource(dataSource());
        mybatisSqlSessionFactoryBean.setDataSource(dataSource);

        if (StringUtils.hasLength(this.properties.getTypeAliasesPackage())) {
            mybatisSqlSessionFactoryBean.setTypeAliasesPackage(this.properties.getTypeAliasesPackage());
        }
        if (!ObjectUtils.isEmpty(this.properties.resolveMapperLocations())) {
            mybatisSqlSessionFactoryBean.setMapperLocations(this.properties.resolveMapperLocations());
        }
        if (!ObjectUtils.isEmpty(this.properties.getTypeHandlersPackage())) {
            mybatisSqlSessionFactoryBean.setTypeHandlersPackage(this.properties.getTypeHandlersPackage());
        }
        return mybatisSqlSessionFactoryBean;
    }


}
