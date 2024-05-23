package com.JPAejercicios.capitulo3.entidad;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @SequenceGenerator(name = "Gen", sequenceName = "EMPLOYEES_SEQ")
    @GeneratedValue(generator = "Gen")
    @Column(name = "EMPLOYEE_ID")
    private int employee_id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "EMAIL")
    @Basic(fetch = FetchType.LAZY)
    private String email;

    @Column(name = "JOB_ID")
    private String jobId;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "HIRE_DATE")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date hireDate;

    @Column(name = "SALARY")
    private float salary;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;
}
