/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tungk
 */
public class Bai3 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        size=sc.nextInt();
        //int soNsuyen[size];
        int[] soNguyen = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Nhap phan tu: ");
            soNguyen[i]= sc.nextInt();
        }
        
        System.out.println("Mang vua nhap : "+ Arrays.toString(soNguyen));
        
        Arrays.sort(soNguyen);
        System.out.printf("Phan tu nho nhat co gia tri = %d\n",soNguyen[0]);
        int dem=0;
        int tong=0;
        double tb=0;
        for(int i=0;i<size;i++){
            if(soNguyen[i] % 3 == 0){
                tong+=soNguyen[i];
                dem++;
            }
        }
        tb=(double)tong/(double)dem;
        System.out.printf("Trung binh tong cac phan tu chia het cho 3 = %.2f\n",tb);
    }
}
