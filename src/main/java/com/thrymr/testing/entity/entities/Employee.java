package com.thrymr.testing.entity.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private Integer empId;
    @Column(nullable = false)
    private String empName;
    LocalDate dateOfJoining;
    LocalTime timeOfJoining;
    Float empSalary;
    Byte empAge;
    Double bankBalance;
    @Column(columnDefinition = "TEXT")
    String aboutEmp;

}
