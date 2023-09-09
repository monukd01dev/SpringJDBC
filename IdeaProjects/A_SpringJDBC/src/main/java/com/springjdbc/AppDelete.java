package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Name    : Monu KD (monukd01dev)
    Project : A_SpringJDBC
    Date    : 09-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class AppDelete {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao template = context.getBean("studentDao", StudentDao.class);

        int result = template.delete(104);
        System.out.println("Total no of student deleted : " + result);

    }
}
