package com.thrymr.testing.entity.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer attendanceId;
    @Column(name = "date",unique = true)
    Date date;
    @Enumerated(EnumType.STRING)
    @Column(name = "attendanceStatus")
    AttendanceStatus status;
}
