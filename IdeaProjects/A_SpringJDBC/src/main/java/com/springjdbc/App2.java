package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Name    : Monu KD (monukd01dev)
    Project : A_SpringJDBC
    Date    : 08-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        //creating student
        Student s1 = new Student(104, "Amit Kumar", "Burari Delhi");

        //firing query using proper way
        int result = studentDao.insert(s1);

        //printing the result
        System.out.println("Number of record inserted : "+result);
    }
}
