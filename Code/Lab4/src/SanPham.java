
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungk
 */
public class SanPham {
    private String ten;
    private double gia;
    private double giamgia;
    private double thue;
    
    Scanner sc = new Scanner(System.in);
    public String getTen(){
        return this.ten;
    }
    public double getGia(){
        return this.gia;
    }
    public double getGiamGia(){
        return this.giamgia;
    }
    public double getThue(){
        return this.thue;
    }
     public void setTen(String x){
         this.ten = x;
     }
    public void setGia(double x){
        this.gia = x;
    }
    public void setGiamGia(double x){
        this.giamgia = x;
    }
    public void setThue(double x){
        this.thue = x;
    }
    public void nhap(){
        System.out.println("Ten san pham : ");
        this.ten = sc.nextLine();
        System.out.println("Don gia: ");
        this.gia = Double.parseDouble(sc.nextLine());
        System.out.println("Giam gia: ");
        this.giamgia = Double.parseDouble(sc.nextLine());
        this.thue = this.gia*0.1;
    }
    public void xuat(){
        System.out.println("Ten san pham: "+this.getTen());
        System.out.println("Don gia: "+this.getGia());
        System.out.println("Giam gia: "+this.getGiamGia());
        System.out.println("Thue: "+this.getThue());
    }
}
