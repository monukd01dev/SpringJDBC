package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC Started" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        //Create query
        String query = "insert into student(id,name,city) values(?,?,?)";

        //firing the query
        int result = template.update(query, 102, "Lalit Gupta", "New Delhi");
        System.out.println("The total no. of insertion is : " + result);

    }
}










