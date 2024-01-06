/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author tungk
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int chonCN = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("--------------------");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac hai");
            System.out.println("3. Tinh tien dien");
            System.out.println("0. Thoat");
            System.out.println("--------------------");
            System.out.println("Moi ban nhap chuc nang can dung: ");
            do{
                chonCN = sc.nextInt();
                if(checkSoNguyen(chonCN)==0){
                    System.out.println("Loi roi moi nhap so nguyen. Nhap lai!");
                }
            }while(checkSoNguyen(chonCN)==0);
            switch(chonCN){
                case 1 -> {
                    System.out.println("Thuc hien chuc nang 1");
                    chucnang1();
                }
                case 2 -> {
                    System.out.println("Thuc hien chuc nang 2");
                    chucnang2();
                }
                case 3 -> {
                    System.out.println("Thuc hien chuc nang 3");
                    chucnang3();
                }
                case 0 -> {
                    System.out.println("Thoat!");
                }
                default -> {
                    System.out.println("Khong co CN nay. Chon lai CN can dung.");
                }
            }
        }while(chonCN != 0);
    }
    public static int checkSoNguyen(double x){
        int check = 0;
        if(x == (int)x){
            check=1;
        }
        return check;
    }
    public static void chucnang1(){
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Nhap a:");
        a=sc.nextDouble();
        System.out.println("Nhap b:");
        b=sc.nextDouble();
        if(a == 0){
            System.out.println("Phuong trinh vo nghiem");
        }else{
            System.out.printf("Phuong trinh co nghiem x= %f\n",-b/a);
        }
    }
    public static void chucnang2(){
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
    public static void chucnang3(){
        Scanner sc = new Scanner(System.in);
        int soKLW;
        int giaDien;
        System.out.println("Nhap so dien da su dung:");
        soKLW = sc.nextInt();
        if(soKLW <= 50){
            giaDien=soKLW*1000;
        }else{
            giaDien=50*1000+(soKLW-50)*1200;
        }
        System.out.printf("So tien dien can thanh toan: %d\n",giaDien);
    }
}
