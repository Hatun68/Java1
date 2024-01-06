/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author tungk
 */
public class TruongPhong extends NhanVien{
    
    private double luongTrachNhiem;

    public TruongPhong(String manv, String hoten, double luong, String phongBan, double luongTrachNhiem) {
        super(manv, hoten, luong, phongBan);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
    
    double getThuNhap(){
        return luong+luongTrachNhiem;
    }
    
}
