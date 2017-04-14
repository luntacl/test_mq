package com.ulic.config.mybatis;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by liutao on 2017/4/11.
 */
@Configuration
@MapperScan(basePackages = "com.ulic.core.*.dao")
public class MybatisConfig {
    @Autowired
    private Environment envirmt;

    @Bean
    public DataSource getDatasource() throws Exception {
        Properties props = new Properties();
        props.put("driverClassName", envirmt.getProperty("spring.datasource.driver-class-name"));
        props.put("url", envirmt.getProperty("spring.datasource.url"));
        props.put("username", envirmt.getProperty("spring.datasource.username"));
        props.put("password", envirmt.getProperty("spring.datasource.password"));
        return DruidDataSourceFactory.createDataSource(props);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage(envirmt.getProperty("mybatis.typeAliasesPackage"));
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(envirmt.getProperty("mybatis.mapperLocations")));
        return factoryBean.getObject();
    }
}
