package com.JPAejercicios.capitulo3.entidad;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Departments")
public class Department implements Serializable {

    @Id
    @SequenceGenerator(name = "Gen2", sequenceName = "DEPARTMENTS_SEQ")
    @GeneratedValue(generator = "Gen2")
    private int department_id;

    private String department_name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;

    public Department(String department_name) {
        this.department_name = department_name;
    }

    public Department() {

    }

    public String getDepartmentName() {
        if (department_name.length() < 10) department_name = "dep" + department_name;
        return department_name;
    }

    public void setDepartmentName(String departmentName) {
        this.department_name = departmentName;
    }
}
