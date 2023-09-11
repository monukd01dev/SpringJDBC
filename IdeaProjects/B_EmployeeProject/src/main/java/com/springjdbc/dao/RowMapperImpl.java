package com.springjdbc.dao;

import com.springjdbc.entities.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/*
    Name    : Monu KD (monukd01dev)
    Project : B_EmployeeProject
    Date    : 11-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class RowMapperImpl implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {

        return new Employee(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                resultSet.getDouble(5),
                resultSet.getString(6),
                resultSet.getString(7));


    }
}
