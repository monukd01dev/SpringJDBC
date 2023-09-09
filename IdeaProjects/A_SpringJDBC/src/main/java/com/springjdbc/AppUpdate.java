package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/*
    Name    : Monu KD (monukd01dev)
    Project : A_SpringJDBC
    Date    : 08-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class AppUpdate {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        Student s1 = new Student(104, "Ashish Kumar Rai", "Okhla");

        int result = studentDao.change(s1);

        //printing the result
        System.out.println("Number of record changed : "+result);
    }
}
