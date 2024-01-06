/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author tungk
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho va ten:");
        String hoTen = scanner.nextLine();
        System.out.println("Diem TB: ");
        double diemTB= scanner.nextDouble();
        System.out.println("Xuat:");
        System.out.print("Ho va ten:");
        System.out.println(hoTen);
        System.out.printf("DiemTB = %f\n",diemTB);
        
    }
    
}
