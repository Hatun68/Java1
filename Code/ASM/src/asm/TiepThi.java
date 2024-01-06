/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author tungk
 */
public class TiepThi extends NhanVien{
    private double doanhSo;
    private double hueHong;

    public TiepThi( String manv, String hoten, double luong, String phongBan , double doanhSo, double hueHong) {
        super(manv, hoten, luong, phongBan);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

   

    public double getDoanhSo() {
        return doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    
    double getThuNhap(){
        return luong+doanhSo*hueHong;
    }
    
}
