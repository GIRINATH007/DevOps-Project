package com.company.portal.model;

import lombok.Getter;

@Getter
public class Employee {
    private final String name;
    private final String role;
    private final String department;

    public Employee(String name, String role, String department) {
        this.name = name;
        this.role = role;
        this.department = department;
    }
}
