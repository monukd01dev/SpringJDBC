package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/*
    Name    : Monu KD (monukd01dev)
    Project : A_SpringJDBC
    Date    : 11-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
@Configuration
@ComponentScan(basePackages = "com.springjdbc.dao")
public class JavaConfig {
    @Bean
    public DataSource getDataSource() {
        return new DriverManagerDataSource("jdbc:mysql:///springjdbc","root","root");
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

//Used AutoWiring
//    @Bean("studentDao")
//    public StudentDao getStudentDao() {
//        return new StudentDaoImpl(getJdbcTemplate());
//    }
}
