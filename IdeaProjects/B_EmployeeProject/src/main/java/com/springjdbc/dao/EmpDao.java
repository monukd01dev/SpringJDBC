package com.springjdbc.dao;

import com.springjdbc.entities.Employee;

public interface EmpDao {
    public int insert(Employee employee);
    public int update(Employee employee);
    public int delete(int emp_id);

}
