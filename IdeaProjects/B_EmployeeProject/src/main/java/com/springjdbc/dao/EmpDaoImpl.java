package com.springjdbc.dao;

import com.springjdbc.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/*
    Name    : Monu KD (monukd01dev)
    Project : B_EmployeeProject
    Date    : 09-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/

@Component("dao")
public class EmpDaoImpl implements EmpDao {
    private JdbcTemplate template;

    @Autowired
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
        String query = "update employee set fname=? , lname=? , salary=? ,domain=? ,address=?,country=? where emp_id=?";
        int result = template.update(query,employee.getFname(),employee.getLname(),
                employee.getSalary(),employee.getDomain(),employee.getAddress(),employee.getAddress(),employee.getEmp_id());
        return result;
    }

    @Override
    public int delete(int emp_id) {
        String query = "delete from employee where emp_id = ?";
        int result = template.update(query,emp_id);
        return result;
    }

    @Override
    public Employee getEmployee(int emp_id) {
        String query = "select * from employee where emp_id = ?";
        return this.template.queryForObject(query,new RowMapperImpl(),emp_id);

    }

    @Override
    public List<Employee> getAllEmployees() {
        String query = "select * from employee";
        return this.template.query(query,new RowMapperImpl());
    }

}
