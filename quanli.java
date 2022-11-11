/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import ThuocTinh.HangXe;
import ThuocTinh.LoaiXe;
import ThuocTinh.MauXe;
import ThuocTinh.XeMay;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class quanli extends ConnectToSQL {

    Connection conn;
    ResultSet rs;
    PreparedStatement pts;
    //câu lệnh hãng xe
    String getdl = "SELECT * FROM Hang_xe where trang_thai=1";
    String add_hang = "INSERT INTO Hang_xe(Ma_Hang,Ten_hang,Mo_ta,Trang_thai) VALUES (?,?,?,'1')";
    String update_hang = "UPDATE Hang_xe SET Ten_hang=?,Mo_ta=? WHERE Ma_Hang=?";
    String dis_hang = "UPDATE Hang_xe SET Trang_thai='0' WHERE Ma_Hang=?";

    //cau lệnh loại xe
    String get_loaixe = "SELECT * FROM Loai_xe where Trang_thai=1";
    String add_loai = "INSERT INTO Loai_xe(Ma_Loai,Ten_loai_xe,Mo_ta,Trang_thai) VALUES (?,?,?,'1')";
    String update_loai = "UPDATE Loai_xe SET Ten_loai_xe=?,Mo_ta=? WHERE Ma_Loai=?";
    String dis_loai = "UPDATE Loai_xe SET Trang_thai='0' WHERE Ma_Loai=?";
    
    //câu lệnh màu xe
    String get_mau="SELECT * FROM Mauxe WHERE Trang_thai=1";
    String add_mau="INSERT INTO Mauxe (Ma_Mau,Mau_xe,Trang_thai) VALUES (?,?,1)";
    String dis_mau="UPDATE Mauxe SET Trang_thai=0 WHERE Ma_Mau=?";
    
    //câu lệnh xe máy
    String get_xe="SELECT * FROM Xe_may WHERE Trang_thai=1";
    String add_xe="INSERT INTO Xe_may (Ma_Xe,Ten_xe,Gia,Ma_Loai,Ma_Mau,Ma_Hang,So_khung,Dung_tich,Ton_kho,Trang_thai) VALUES (?,?,?,?,?,?,?,?,?,?,?,1)";
    //String update_xe_anh="UPDATE Xe_may SET Ten_Xe=?,Gia=?,Ma_Loai=?,Ma_Mau=?,Ma_Hang=?,Anh_xe=?,So_khung=?,So_may=?,Dung_tich=?,Ton_kho=? WHERE Ma_Xe=?";
    String update_xe="UPDATE Xe_may SET Ten_xe=?,Gia=?,Ma_Loai=?,Ma_Mau=?,Ma_Hang=?,So_khung=?,Dung_tich=?,Ton_kho=? WHERE Ma_Xe=?";
    String Dis_xe="UPDATE Xe_may SET Trang_thai=0 WHERE Ma_Xe=?";
    String hang_xe_all="SELECT * FROM Hang_xe where Trang_thai=1";
    String hang_id_xe="SELECT * FROM Hang_xe WHERE Ma_Hang=?";
    String loai_xe_all="SELECT * FROM Loai_xe where Trang_thai=1";
    String loai_id_xe="SELECT * FROM Loai_xe  Where Ma_Loai=?";
    String mau_xe_all="SELECT * FROM Mauxe WHERE Trang_thai=1";
    String mau_id_xe="SELECT * FROM Mauxe WHERE Ma_Mau=?";

    //HÃNG XE
    public ArrayList<HangXe> getDataHang() {
        ArrayList<HangXe> dsHang = new ArrayList<>();
        conn = openConnection();
        try {
            pts = conn.prepareCall(getdl);
            rs = pts.executeQuery();
            while (rs.next()) {
                HangXe hang_xe = new HangXe();
                hang_xe.setMa_Hang(rs.getString("Ma_Hang"));
                hang_xe.setTen_Hang(rs.getString("Ten_hang"));
                hang_xe.setThong_Tin(rs.getString("Mo_ta"));
                dsHang.add(hang_xe);

            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsHang;
    }

    public boolean add_hang(HangXe h_xe) {
        boolean check = false;
        conn = openConnection();
        try {
            pts = conn.prepareCall(add_hang);
            pts.setString(1, h_xe.getMa_Hang());
            pts.setString(2, h_xe.getTen_Hang());
            pts.setString(3, h_xe.getThong_Tin());
            int p = pts.executeUpdate();
            if (p > 0) {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    public boolean update_hang(HangXe h_xe) {
        boolean check = false;
        conn = openConnection();
        try {
            pts = conn.prepareCall(update_hang);
            pts.setString(1, h_xe.getTen_Hang());
            pts.setString(2, h_xe.getThong_Tin());
            pts.setString(3, h_xe.getMa_Hang());
            int l = pts.executeUpdate();
            if (l > 0) {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    public boolean delete_hang(String ma_hang) {
        boolean check = false;
        conn = openConnection();
        try {
            pts = conn.prepareCall(dis_hang);
            pts.setString(1, ma_hang);
            int q = pts.executeUpdate();
            if (q > 0) {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectToSQL.closeConnection(conn);
        }
        return check;

    }

    //LOẠI XE
    public ArrayList<LoaiXe> getDataLoai() {
        ArrayList<LoaiXe> dsLoai = new ArrayList<>();
        
        conn = openConnection();

        try {
            pts = conn.prepareCall(get_loaixe);
            rs = pts.executeQuery();
            while (rs.next()) {
                LoaiXe loai_xe = new LoaiXe();
                loai_xe.setMa_Loai(rs.getString("Ma_Loai"));
                loai_xe.setTen_Loai(rs.getString("Ten_loai_xe"));
                loai_xe.setMota(rs.getString("Mo_ta"));

                dsLoai.add(loai_xe);

            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsLoai;
    }


    public boolean add_loai_xe(LoaiXe l_xe) {
        boolean check = false;
        conn = openConnection();
        try {
            pts = conn.prepareCall(add_loai);
            pts.setString(1, l_xe.getMa_Loai());
            pts.setString(2, l_xe.getTen_Loai());
            pts.setString(3, l_xe.getMota());
            int y = pts.executeUpdate();
            if (y > 0) {
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    public boolean update_loai_xe(LoaiXe l_xe) {
        boolean check = false;
        conn = openConnection();
        try {
            pts = conn.prepareCall(update_loai);
            pts.setString(1, l_xe.getTen_Loai());
            pts.setString(2, l_xe.getMota());
            pts.setString(3, l_xe.getMa_Loai());
            int l = pts.executeUpdate();
            if (l > 0) {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    public boolean delete_loai_xe(String ma_loai) {
        boolean check = false;
        conn = openConnection();
        try {
            pts = conn.prepareCall(dis_loai);
            pts.setString(1, ma_loai);
            int h = pts.executeUpdate();
            if (h > 0) {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectToSQL.closeConnection(conn);
        }
        
        return check;
    }
    
    //Màu xe    
    public ArrayList<MauXe> getDataMau(){
        
        ArrayList dsMau = new ArrayList<>();
        conn=openConnection();
        try {
            pts=conn.prepareCall(get_mau);
            rs=pts.executeQuery();
            while(rs.next()){
                MauXe mau_xe=new MauXe();
                mau_xe.setMa_Mau(rs.getString("Ma_Mau"));
                mau_xe.setMau_Xe(rs.getString("Mau_xe"));
                mau_xe.setTrangthai(rs.getBoolean("Trang_thai"));
                dsMau.add(mau_xe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return dsMau;
    }
    public boolean add_mau_xe(MauXe m_xe){
        boolean check=false;
        conn=openConnection();
        try {
            pts=conn.prepareCall(add_mau);
            pts.setString(1, m_xe.getMa_Mau());
            pts.setString(2, m_xe.getMau_Xe());
            int p=pts.executeUpdate();
            if(p>0){
                check=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return check;
    }
    public boolean delete_mau_xe(String ma_mau){
        boolean check=false;
        conn=openConnection();
        try {
            pts=conn.prepareCall(dis_mau);
            pts.setString(1, ma_mau);
            int  t=pts.executeUpdate();
            if(t>0){
                check=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    
    
    public ArrayList<XeMay> getDL_xe(){
        ArrayList<XeMay> dsXe = new ArrayList<>();
        conn=openConnection();
        try {
            pts=conn.prepareCall(get_xe);
            rs=pts.executeQuery();
            while(rs.next()){
                XeMay xe_may=new XeMay();
                xe_may.setMa_Xe(rs.getString("Ma_Xe"));
                xe_may.setTen_Xe(rs.getString("Ten_Xe"));
                xe_may.setGia(rs.getFloat("Gia"));
                //xe_may.setMa_loai(rs.getString("Ma_Loai"));
                xe_may.setMa_Hang(rs.getString("Ma_Hang"));
                xe_may.setMa_Mau(rs.getString("Ma_Mau"));
                //xe_may.setBit(rs.getBytes("Anh_xe"));
                xe_may.setSo_Khung(rs.getString("So_khung"));
                xe_may.setDung_Tich(rs.getString("Dung_tich"));
                xe_may.setTon_Kho(rs.getInt("Ton_kho"));
                dsXe.add(xe_may);
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dsXe;
    }
    public boolean add_xe_may(XeMay x_may){
        boolean check=true;
        conn=openConnection();
        try {
            
            pts=conn.prepareCall(add_xe);
            pts.setString(1, x_may.getMa_Xe());
            pts.setString(2, x_may.getTen_Xe());
            pts.setFloat(3, x_may.getGia());
            pts.setString(4, x_may.getMa_Loai());
            pts.setString(5, x_may.getMa_Mau());
            pts.setString(6, x_may.getMa_Hang());
            //pts.setBlob(7, xe_may.getAnh_xe());
            pts.setString(7, x_may.getSo_Khung());
            pts.setString(8, x_may.getDung_Tich());
            pts.setInt(9, x_may.getTon_Kho());
            int k=pts.executeUpdate();
            if(k>0){
                check=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    public boolean update_xe(XeMay x_may){
        boolean check=false;
        conn=openConnection();
        try {
            pts=conn.prepareCall(update_xe);
            pts.setString(1, x_may.getTen_Xe());
            pts.setFloat(2, x_may.getGia());
            pts.setString(3, x_may.getMa_Loai());
            pts.setString(4, x_may.getMa_Mau());
            pts.setString(5, x_may.getMa_Hang());
            pts.setString(6, x_may.getSo_Khung());
            pts.setString(7, x_may.getDung_Tich());
            pts.setInt(8, x_may.getTon_Kho());
            pts.setString(9, x_may.getMa_Xe());
            int p=pts.executeUpdate();
            if(p>0){
                check=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
//    public boolean update_anh_xe(xemay_entiti xe_may){
//        boolean check=false;
//        conn=openConnection();
//        try {
//            pts=conn.prepareCall(update_xe_anh);
//            pts.setString(1, xe_may.getTen_xe());
//            pts.setFloat(2, xe_may.getGia());
//            pts.setString(3, xe_may.getMa_loai());
//            pts.setString(4, xe_may.getMa_mau());
//            pts.setString(5, xe_may.getMa_hang());
//            pts.setBlob(6, xe_may.getAnh_xe());
//            pts.setString(7, xe_may.getSo_khung());
//            pts.setString(8, xe_may.getSo_may());
//            pts.setString(9, xe_may.getDung_tich());
//            pts.setInt(10, xe_may.getTon_kho());
//            pts.setString(11, xe_may.getMa_xe());
//            int p=pts.executeUpdate();
//            if(p>0){
//                check=true;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return check;
//    }
    public boolean delete_xe_may(String ma_xe){
        boolean check=false;
        conn=openConnection();
        try {
            pts=conn.prepareCall(Dis_xe);
            pts.setString(1, ma_xe);
            int k=pts.executeUpdate();
            if(k>0){
                check=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    public ArrayList<HangXe> hangxe_id(String ma_hang){
       ArrayList<HangXe> ob_h=new ArrayList<>();
        conn=openConnection();
        try {
            pts=conn.prepareCall(hang_id_xe);
            pts.setString(1, ma_hang);
            rs=pts.executeQuery();
            while(rs.next()){
                HangXe hang_xe=new HangXe();
                hang_xe.setMa_Hang(rs.getString("Ma_Hang"));
                hang_xe.setTen_Hang(rs.getString("Ten_hang"));
                ob_h.add(hang_xe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ob_h;
    }
    
    public ArrayList<LoaiXe> loaixe_id(String ma_loai){
       ArrayList<LoaiXe> ob_l=new ArrayList<>();
        conn=openConnection();
        try {
            pts=conn.prepareCall(loai_id_xe);
            pts.setString(1, ma_loai);
            rs=pts.executeQuery();
            while(rs.next()){
                LoaiXe l_xe = new LoaiXe();
                l_xe.setMa_Loai(rs.getString("Ma_Loai"));
                l_xe.setTen_Loai(rs.getString("Ten_loai_xe"));
                ob_l.add(l_xe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ob_l;
    }
    
    public ArrayList<MauXe> mauxe_id(String ma_mau){
       ArrayList<MauXe> ob_m=new ArrayList<>();
        conn=openConnection();
        try {
            pts=conn.prepareCall(mau_id_xe);
            pts.setString(1, ma_mau);
            rs=pts.executeQuery();
            while(rs.next()){
                MauXe mau_xe=new MauXe();
                mau_xe.setMa_Mau(rs.getString("Ma_Mau"));
                mau_xe.setMau_Xe(rs.getString("Mau_xe"));
                ob_m.add(mau_xe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ob_m;
    }
}
