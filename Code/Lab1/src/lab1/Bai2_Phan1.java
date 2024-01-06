/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author tungk
 */
public class Bai2_Phan1 {
    public static void main(String[] args) {
        double chieuDai;
        double chieuRong;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap: ");
        System.out.println("Chieu dai:");
        chieuDai = sc.nextDouble();
        System.out.println("Chieu rong: ");
        chieuRong = sc.nextDouble();
        
        double chuVi;
        double dienTich;
        
        chuVi=(chieuDai+chieuRong)*2;
        dienTich = chieuDai*chieuRong;
        
        System.out.println("Xuat:");
        System.out.printf("Chu vi = %f\n",chuVi);       
        System.out.printf("Dien tich = %f\n",dienTich);
        System.out.printf("Canh nho nhat = %f\n",Math.min(chieuDai,chieuRong));
    }
}
