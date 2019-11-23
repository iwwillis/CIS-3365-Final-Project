package com.example.FinalProject.Models;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int employeeID;

    @Column(name = "firstname")
    public String firstName;


    @Column(name = "lastname")
    public String lastName;

    @Column(name="employeestatus")
    public String employeeStatus;

    public Employee(){

    }

    public Employee(String first, String last, String empStatus, int id) {
        this.firstName = first;
        this.lastName = last;
        this.employeeStatus = empStatus;
        this.employeeID = id;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }
}
