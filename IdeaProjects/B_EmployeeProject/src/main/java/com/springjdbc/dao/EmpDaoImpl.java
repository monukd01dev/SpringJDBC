package com.springjdbc.dao;

import com.springjdbc.entities.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

/*
    Name    : Monu KD (monukd01dev)
    Project : B_EmployeeProject
    Date    : 09-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class EmpDaoImpl implements EmpDao {
    private JdbcTemplate template;

    public EmpDaoImpl(JdbcTemplate template) {
        this.template = template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }


    @Override
    public int insert(Employee employee) {
        String query = "insert into employee(emp_id,fname,lname,domain,salary,address,country) values (?,?,?,?,?,?,?)";
        int result = template.update(query,employee.getEmp_id(),employee.getFname(),employee.getLname(),employee.getDomain(),
                employee.getSalary(),employee.getAddress(),employee.getCountry());
        return result;
    }

    @Override
    public int update(Employee employee) {
        String query = "update employee set fname=? , lname=? , salary=? where emp_id=?";
        int result = template.update(query,employee.getFname(),employee.getLname(),
                employee.getSalary(),employee.getEmp_id());
        return result;
    }

    @Override
    public int delete(int emp_id) {
        String query = "delete from employee where emp_id = ?";
        int result = template.update(query,emp_id);
        return 0;
    }
}
