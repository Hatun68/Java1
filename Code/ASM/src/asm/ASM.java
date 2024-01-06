/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm;

import java.util.Scanner;

/**
 *
 * @author tungk
 */
public class ASM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //menu
        DanhSachNV dsnv = new DanhSachNV();
        Scanner sc = new Scanner(System.in);
        int chonCN;
        do{
            System.out.println("----------MENU----------");
            System.out.println("1. Nhap danh sach  nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Tim va hien thi nhan vien theo ma");
            System.out.println("4. Xoa nhan vien theo ma");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma");
            System.out.println("6. Tim cac nhan vien theo khoang luong");
            System.out.println("7. Sap xep nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo nhu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("0. Thoat");
            System.out.println("------------------------");
            System.out.println("Moi chon chuc nang can dung: ");
            chonCN = Integer.parseInt(sc.nextLine());
            switch(chonCN){
                case 0:{
                    System.out.println("Thoat!");
                    break;
                }
                case 1:{
                    System.out.println("1. Nhap danh sach  nhan vien");
                    dsnv.nhap();
                    break;
                }
                case 2:{
                    System.out.println("2. Xuat danh sach  nhan vien");
                    dsnv.xuat();
                    break;
                }
                
                case 3:{
                    System.out.println("3. Tim kiem nhan vien theo ma");
                    dsnv.timkiem();
                    break;
                }
                case 4:{
                    System.out.println("4. Xoa nhan vien theo ma");
                    dsnv.xoa();
                    break;
                }
                default:{
                    System.out.println("Khong co chuc nang nay. Nhap lai!");
                    break;
                }
                
            }
        }while(chonCN != 0);
    }
    
}
