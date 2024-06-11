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
public class Department {
    private String id;
    private String name;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }
    List<Manages> list = new ArrayList<>();
    public void printAll(){
        for(Manages m : list){
            System.out.println("ID : " + m.getId() + " - Name : " + m.getName() + " - Address : " + m.getAddress() + " - Position : " + m.getPosition() + " - Salary : " + m.getSalary() + " - Allowance : " + m.getAllowance());
        }
    }
public double totalSalary(){
        double total = 0;
        for(Manages m : list ){
            total += m.getSalary();
        }
        return total;
    }
    public void filterSalary(double k){
        
        for(Manages m : list){
            if(m.getSalary() < k){
                System.out.println("ID : " + m.getId() + " - Name : " + m.getName() + " - Address : " + m.getAddress() + " - Position : " + m.getPosition() + " - Salary : " + m.getSalary() + " - Allowance : " + m.getAllowance());
            }
        }
    }    
    
    public void print(){
        int i = 1;
        double t = 0;
        for(Manages m : list){
            t += m.getSalary() + m.getAllowance();
            System.out.println(i +"  "+ m.getName() + "          " + m.getSalary() + "         " + m.getAllowance()+ "      " + (m.getSalary() + m.getAllowance()) );
            i ++;
        }
        System.out.println("Total       " + t);
    }
   
}
