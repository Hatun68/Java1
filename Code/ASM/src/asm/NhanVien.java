/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author tungk
 */
public abstract class NhanVien {
    protected String manv;
    protected String hoten;
    protected double luong;
    protected String phongBan;

    public NhanVien(String manv, String hoten, double luong, String phongBan) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
        this.phongBan = phongBan;
    }

    public String getManv() {
        return manv;
    }

    public String getHoten() {
        return hoten;
    }

    public double getLuong() {
        return luong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

   
    
    abstract double getThuNhap();
    
}   
