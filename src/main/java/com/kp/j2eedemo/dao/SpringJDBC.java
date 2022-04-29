package com.kp.j2eedemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJDBC {
    @Autowired
    private DriverManagerDataSource source;
    @Bean
    public DriverManagerDataSource initDataSource(){
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.jdbc.Driver");
        source.setUrl("jdbc:mysql:///student?&useSSL=false&serverTimezone=GMT%2B8&&\\\n" +
                "  rewriteBatchedStatements=true&allowMultiQueries=true");
        source.setUsername("root");
        source.setPassword("103735");
        return source;
    }
    @Bean
    public JdbcTemplate initJDBCTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(source);
        return jdbcTemplate;
    }
}
