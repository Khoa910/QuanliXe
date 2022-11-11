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
public class LoaiXe {
    String Ma_Loai;
    String Ten_Loai;
    int id_hang;
    String Mota;
    boolean trangthai;

    public LoaiXe() {
    }

    public LoaiXe(String Ma_Loai, String Ten_Loai, int id_hang, String Mota, boolean trangthai) {
        this.Ma_Loai = Ma_Loai;
        this.Ten_Loai = Ten_Loai;
        this.id_hang = id_hang;
        this.Mota = Mota;
        this.trangthai = trangthai;
    }

    public String getMa_Loai() {
        return Ma_Loai;
    }

    public void setMa_Loai(String Ma_Loai) {
        this.Ma_Loai = Ma_Loai;
    }

    public String getTen_Loai() {
        return Ten_Loai;
    }

    public void setTen_Loai(String Ten_Loai) {
        this.Ten_Loai = Ten_Loai;
    }

    public int getId_hang() {
        return id_hang;
    }

    public void setId_hang(int id_hang) {
        this.id_hang = id_hang;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
}
