package com.springjdbc.entities;

/*
    Name    : Monu KD (monukd01dev)
    Project : B_EmployeeProject
    Date    : 09-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Employee {
    private int emp_id;
    private String fname;
    private String lname;
    private String domain;
    private double salary;
    private String address;
    private String country;

    public Employee() {
        super();
    }

    public Employee(int emp_id, String fname, String lname, String domain, double salary, String address, String country) {
        this.emp_id = emp_id;
        this.fname = fname;
        this.lname = lname;
        this.domain = domain;
        this.salary = salary;
        this.address = address;
        this.country = country;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", domain='" + domain + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
