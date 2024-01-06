/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author tungk
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int size;
        System.out.println("Nhap so sinh vien: ");
        size=Integer.parseInt(sc.nextLine());
        
        double[] diem = new double[size];
        String[] hoten = new String[size];
        String[] hocluc = new String[size];
        int steb;
        System.out.println("Nhap thong tin sinh vien: ");
        for(int i=0;i<size;i++){
            steb=i+1;
            System.out.println("Sinh vien thu "+steb +":");
            System.out.println("He ten: ");
            hoten[i]=sc.nextLine();
            System.out.println("Diem: ");
            diem[i] = Double.parseDouble(sc.nextLine());
        }
        for(int i=0;i<size;i++){
            if(diem[i]<5){
                hocluc[i]="Yeu";
            } else if(diem[i]<6.5){
                hocluc[i]="Trung binh";
            } else if(diem[i]<7.5){
                hocluc[i]="Kha";
            } else if(diem[i]<9){
                hocluc[i]="Gioi";
            } else {
                hocluc[i]="Xuat sac";
            }
        }
        System.out.println("Sap xep theo diem tang dan");
        //sort
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(diem[i]>diem[j]){
                    double x1=diem[i];
                    diem[i]=diem[j];
                    diem[j]=x1;
                    String x2=hoten[i];
                    hoten[i]=hoten[j];
                    hoten[j]=x2;
                    String x3=hocluc[i];
                    hocluc[i]=hocluc[j];
                    hocluc[j]=x3;
                }
            }
        }
        System.out.println("Xuat thong tin sinh vien: ");
        for(int i=0;i<size;i++){
            steb=i+1;
            System.out.println("Sinh vien thu "+steb +":");
            System.out.println("He ten: "+hoten[i]);
            System.out.println("Diem: "+diem[i]);
            System.out.println("Hoc luc: "+hocluc[i]);
            System.out.println("");
        }
    }
    
}
