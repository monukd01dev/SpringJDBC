package com.springjdbc.dao;

import com.springjdbc.entities.Student;

public interface StudentDao {

    public int insert(Student student);
    public int change(Student student);

    public int delete(int studentId);

}
