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
public class MauXe {
    String Ma_Mau;
    String Mau_Xe;
    boolean trangthai;  

    public MauXe() {
    }

    public MauXe(String Ma_Mau, String Mau_Xe, boolean trangthai) {
        this.Ma_Mau = Ma_Mau;
        this.Mau_Xe = Mau_Xe;
        this.trangthai = trangthai;
    }

    public String getMa_Mau() {
        return Ma_Mau;
    }

    public void setMa_Mau(String Ma_Mau) {
        this.Ma_Mau = Ma_Mau;
    }

    public String getMau_Xe() {
        return Mau_Xe;
    }

    public void setMau_Xe(String Mau_Xe) {
        this.Mau_Xe = Mau_Xe;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    

    
    
    
}

