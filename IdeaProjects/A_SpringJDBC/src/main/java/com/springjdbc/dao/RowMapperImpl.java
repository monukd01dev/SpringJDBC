package com.springjdbc.dao;

import com.springjdbc.entities.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/*
    Name    : Monu KD (monukd01dev)
    Project : A_SpringJDBC
    Date    : 10-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class RowMapperImpl implements RowMapper<Student>{

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student(resultSet.getInt(1),
                                        resultSet.getString(2),
                                        resultSet.getString(3));
        return student;
    }
}

