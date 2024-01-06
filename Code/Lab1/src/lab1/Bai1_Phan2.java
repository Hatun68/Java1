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
public class Bai1_Phan2 {
    public static void main(String[] args) {
        double canh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai canh cua khoi lap phuong: ");
        canh = sc.nextDouble();
        
        double theTich=Math.pow(canh,3);
        System.out.printf("The tich khoi lap phuong = %f",theTich);
    }
}
