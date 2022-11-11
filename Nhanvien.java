/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuocTinh;

/**
 *
 * @author Admin
 */
public class Nhanvien {
    String ma_nv;
    String pass;
    String tentk;
    String hoten;
    String diachi;
    String sdt;
    String thongtin;
    
    int role;
    String ngaydk;
    String ngay_nghi;
    boolean trangthai;
 
    public Nhanvien() {
    }

    public Nhanvien(String ma_nv,String pass,String tentk, String hoten, String diachi, String sdt, String thongtin, int role, String ngaydk,String ngay_nghi, boolean trangthai) {
        this.ma_nv = ma_nv;
        this.tentk = tentk;
        this.hoten = hoten;
        this.pass=pass;
        this.diachi = diachi;
        this.sdt = sdt;
        this.thongtin = thongtin;
        this.role = role;
        this.ngaydk = ngaydk;
        this.trangthai = trangthai;
        this.ngay_nghi=ngay_nghi;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    

    public String getTentk() {
        return tentk;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getThongtin() {
        return thongtin;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getNgaydk() {
        return ngaydk;
    }

    public void setNgaydk(String ngaydk) {
        this.ngaydk = ngaydk;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public String getNgay_nghi() {
        return ngay_nghi;
    }

    public void setNgay_nghi(String ngay_nghi) {
        this.ngay_nghi = ngay_nghi;
    }
    
    
}

