/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author tungk
 */
public class HanhChinh extends NhanVien{

    public HanhChinh(String manv, String hoten, double luong, String phongBan) {
        super(manv, hoten, luong, phongBan);
    }
    
    double getThuNhap(){
        return luong;
    }
    
}
