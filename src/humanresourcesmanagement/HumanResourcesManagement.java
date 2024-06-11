/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package humanresourcesmanagement;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HumanResourcesManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department temp = new Department("IT01","CNTT");
        Manages manages1 = new Manages("Sinh vien " , 10, 100, "SV01", "Thua Van An", "Thanh Hoa", temp);
        Manages manages2 = new Manages("Sinh vien " , 10, 200, "SV02", "Nguyen Quan", "Thai Binh", temp);
        Manages manages3 = new Manages("Sinh vien " , 10, 300, "SV03", "Le Van Anh ", "Ha Noi", temp);
        temp.list.add(manages1);
        temp.list.add(manages2);
        temp.list.add(manages3);
       temp.print();
       temp.printAll();
        System.out.println("Nhap gia can loc : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       temp.filterSalary(n);

    }
    
}
