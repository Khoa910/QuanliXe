/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuocTinh;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import com.sun.javafx.fxml.expression.BinaryExpression;
//import java.io.InputStream;


public class XeMay {
    String Ma_Xe;
    String Ten_Xe;
    float Gia;
    //InputStream anh_xe;
    //byte[] bit;
    String So_Khung;
    String Dung_Tich;
    boolean trang_thai;
    String  Ma_Loai;
    String Ma_Hang;
    String Ma_Mau;
    int Ton_Kho;

    public XeMay() {
    }

    public XeMay(String Ma_Xe, String Ten_Xe, float Gia, String So_Khung, String Dung_Tich, boolean trang_thai, String Ma_Loai, String Ma_Hang, String Ma_mau, int Ton_Kho) {
        this.Ma_Xe = Ma_Xe;
        this.Ten_Xe = Ten_Xe;
        this.Gia = Gia;
        this.So_Khung = So_Khung;
        this.Dung_Tich = Dung_Tich;
        this.trang_thai = trang_thai;
        this.Ma_Loai = Ma_Loai;
        this.Ma_Hang = Ma_Hang;
        this.Ma_Mau = Ma_Mau;
        this.Ton_Kho = Ton_Kho;
    }

    public String getMa_Xe() {
        return Ma_Xe;
    }

    public void setMa_Xe(String Ma_Xe) {
        this.Ma_Xe = Ma_Xe;
    }

    public String getTen_Xe() {
        return Ten_Xe;
    }

    public void setTen_Xe(String Ten_Xe) {
        this.Ten_Xe = Ten_Xe;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public String getSo_Khung() {
        return So_Khung;
    }

    public void setSo_Khung(String So_Khung) {
        this.So_Khung = So_Khung;
    }

    public String getDung_Tich() {
        return Dung_Tich;
    }

    public void setDung_Tich(String Dung_Tich) {
        this.Dung_Tich = Dung_Tich;
    }

    public boolean isTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(boolean trang_thai) {
        this.trang_thai = trang_thai;
    }

    public String getMa_Loai() {
        return Ma_Loai;
    }

    public void setMa_Loai(String Ma_Loai) {
        this.Ma_Loai = Ma_Loai;
    }

    public String getMa_Hang() {
        return Ma_Hang;
    }

    public void setMa_Hang(String Ma_Hang) {
        this.Ma_Hang = Ma_Hang;
    }

    public String getMa_Mau() {
        return Ma_Mau;
    }

    public void setMa_Mau(String Ma_mau) {
        this.Ma_Mau = Ma_Mau;
    }

    public int getTon_Kho() {
        return Ton_Kho;
    }

    public void setTon_Kho(int Ton_Kho) {
        this.Ton_Kho = Ton_Kho;
    }

    
    
}

