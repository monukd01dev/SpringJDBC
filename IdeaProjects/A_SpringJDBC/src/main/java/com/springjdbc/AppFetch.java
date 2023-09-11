package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Name    : Monu KD (monukd01dev)
    Project : A_SpringJDBC
    Date    : 10-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class AppFetch {
    public static void main(String[] args) {
        //xml configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //JavaConfiguration
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = studentDao.getStudent(102);
        System.out.println(student);

        //fetch_all
        System.out.println(studentDao.getAllStudent());


    }
}
