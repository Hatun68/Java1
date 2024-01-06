/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.io.Flushable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tungk
 */
public class DanhSachNV {
    ArrayList<NhanVien> list = new ArrayList<>();
    
    public void nhap(){
        //
        Boolean check = true;
        //
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ma nhan vien: ");
            String manv = sc.nextLine();
            System.out.print("Nhap he ten nhan vien: ");
            String hoten = sc.nextLine();
            System.out.print("Nhap luong nhan vien: ");
            double luong = Double.parseDouble(sc.nextLine());
            
            System.out.print("Nhap phong ban: ");
            String phongBan = sc.nextLine();
            if(phongBan.equalsIgnoreCase("hanh chinh")){
                NhanVien nv = new HanhChinh(manv, hoten, luong, phongBan);
                list.add(nv);
            }
            if(phongBan.equalsIgnoreCase("tiep thi")){
                System.out.print("Nhap doanh so: ");
                double doanhSo = sc.nextDouble();
                System.out.print("Nhap hue hong: ");
                double hueHong = sc.nextDouble();
                NhanVien nv = new TiepThi(manv, hoten, luong, phongBan, doanhSo, hueHong);
                list.add(nv);
            }
            if(phongBan.equalsIgnoreCase("truong phong")){
                System.out.print("Nhap luong trcah nhiep: ");
                double trachnhiem = sc.nextDouble();
                NhanVien nv = new TruongPhong(manv, hoten, luong, phongBan, trachnhiem);
                list.add(nv);  
            }
            
            
            //
            System.out.print("Tiep tuc? [y/n]  ");
            Scanner sc1 = new Scanner(System.in);
            String tieptuc = sc1.nextLine();
            if(tieptuc.equalsIgnoreCase("n")) {
                check = false;
                break;
            }
        } while(check);
    }
    
    public void xuat(){
        for(NhanVien nv: list){
            System.out.println("----------");
            System.out.println("Ma nhan vien: " + nv.getManv());
            System.out.println("Ho ten: "+nv.getHoten());
            System.out.println("Phong ban: "+nv.getPhongBan());
            System.out.println("Luong: "+ nv.getThuNhap());
        }
    }
    
    public void xuat(NhanVien nv){
        System.out.println("Ma nhan vien: " + nv.getManv());
        System.out.println("Ho ten: "+nv.getHoten());
        System.out.println("Phong ban: "+nv.getPhongBan());
        System.out.println("Luong: "+ nv.getThuNhap());
    }
    
    public void timkiem(){
        System.out.print("Nhap ma nhan vien: ");
        Scanner sc = new Scanner(System.in);
        String manv = sc.nextLine();
        Boolean check = false;
        for(NhanVien nv: list){
            if(nv.getManv().equalsIgnoreCase(manv)){
                System.out.println("Tim duoc");
                xuat(nv);
                check = true;
                break;
            } 
            
        }
        if(!check){
            System.out.println("Khong tim thay nhan vien co ma so "+manv);
        }
    }
    
    public void xoa(){
        System.out.print("Nhap ma nhan vien: ");
        Scanner sc = new Scanner(System.in);
        String manv = sc.nextLine();
        Boolean check = false;
        for(NhanVien nv: list){
            if(nv.getManv().equalsIgnoreCase(manv)){
                list.remove(nv);
                System.out.println("Da xoa");
                check = true;
                break;
            } 
            
        }
        if(!check){
            System.out.println("Khong tim thay nhan vien co ma so "+manv);
        }
        
    }
}
