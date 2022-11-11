/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuocTinh;

/**
 *
 * @author Admin
 */
public class HangXe {
    String Ma_Hang;
    String Ten_Hang;
    String Thong_Tin;

    public HangXe() {
    }

    public HangXe(int id_hang, String Ten_Hang, String Thong_Tin) {
        this.Ma_Hang = Ma_Hang;
        this.Ten_Hang = Ten_Hang;
        this.Thong_Tin = Thong_Tin;
    }

    public String getMa_Hang() {
        return Ma_Hang;
    }

    public void setMa_Hang(String Ma_Hang) {
        this.Ma_Hang = Ma_Hang;
    }

    public String getTen_Hang() {
        return Ten_Hang;
    }

    public void setTen_Hang(String Ten_Hang) {
        this.Ten_Hang = Ten_Hang;
    }

    public String getThong_Tin() {
        return Thong_Tin;
    }

    public void setThong_Tin(String Thong_Tin) {
        this.Thong_Tin = Thong_Tin;
    }

    

    
}
