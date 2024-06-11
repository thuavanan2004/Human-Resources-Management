/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanresourcesmanagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Employee extends Profile{
    private double salary;
    Department department = new Department();

    public Employee(double salary, String id, String name, String address, Department deparment) {
        super(id, name, address);
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }
    
}
