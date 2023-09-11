package com.springjdbc.dao;

import com.springjdbc.entities.Employee;

import java.util.List;

public interface EmpDao {
    public int insert(Employee employee);
    public int update(Employee employee);
    public int delete(int emp_id);

    public Employee getEmployee(int emp_id);

    public List<Employee> getAllEmployees();

}
