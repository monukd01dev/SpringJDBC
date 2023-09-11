package com.springjdbc;

import com.springjdbc.dao.EmpDao;
import com.springjdbc.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static <Fetching> void main(String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("EmpConfig.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        EmpDao dao = context.getBean("dao", EmpDao.class);

        //creating employee
        Employee e1 = new Employee(103,"Manish","Dubey","Salesman",2,"Delhi","India");

        //Firing Query
        int result =0;
//       result  = dao.insert(e1);
//        System.out.println("No of row inserted : "+result);
//        result=0;

//        e1.setFname("Lalit");
//        e1.setLname("Gupta");
//        e1.setSalary(1.6);
//
//        result  = dao.update(e1);
//        System.out.println("No of rows updated : "+result);
//        result=0;

//        result  = dao.delete(e1.getEmp_id());
//        System.out.println("No of rows deleted : "+result);
//        result=0;

//        Fetching Query

        System.out.println(dao.getEmployee(103));
//        System.out.println(dao.getAllEmployees());
        for (Employee employee : dao.getAllEmployees()) {
            System.out.println(employee);
        }
    }
}
