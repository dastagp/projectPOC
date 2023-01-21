package com.thrymr.testing.entity.entities;

import jakarta.persistence.*;

import java.io.File;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer stuId;
    String stuName;
    Short idCode;
    @Column(name= "adhaarNumber",length = 12)
    Long adhaar;
}
