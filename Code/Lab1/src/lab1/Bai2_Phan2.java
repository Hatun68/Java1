/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author tungk
 */
public class Bai2_Phan2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        
        Scanner sc = new Scanner(System.in);
        //nhap
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        //code
        double delta;
        double x1;
        double x2;
        if( a == 0){
            //bx+c=0
            if(b == 0){
                //c=0
                if(c == 0){
                    System.out.println("Phuong trinh co vo so nghiem");
                } else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else{
                x1=-c/b;
                System.out.printf("Phuong trinh co 1 nghiem x = %f\n",x1);
            }
        } else{
            delta = pow(b,2)-4*a*c;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            } else if(delta == 0){
                x1=(-b)/(2*a);
                System.out.printf("Phuong trinh co nghiem kep x1=x1= %f",x1);
            } else{
                x1=(-b+ Math.sqrt(delta))/(2*a);          
                x2=(-b- Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem");
                System.out.printf("\tx1= %f\n",x1);       
                System.out.printf("\tx2= %f\n",x2);
            }  
        }
    }
}
