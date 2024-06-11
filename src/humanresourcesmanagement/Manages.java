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
public class Manages extends Employee {
    private String position;
    private double allowance;

    public Manages(String position, double allowance, double salary, String id, String name, String address, Department deparment) {
        super(salary, id, name, address, deparment);
        this.position = position;
        this.allowance = allowance;
    }
    
    public String getPosition() {
        return position;
    }

    public double getAllowance() {
        return allowance;
    }
    
}
