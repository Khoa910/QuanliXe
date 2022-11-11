/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class login_con extends ConnectToSQL{
    public static Connection conn;
    public static PreparedStatement pst;
    public static ResultSet rs;
    
    
    public static ResultSet loginData(String tk,String mk){
        conn = openConnection();    
        String sql="select* from ACCOUNT where USERNAME=? and PASS=?";//truy vấn đến sql
        try {
            pst = conn.prepareCall(sql);//cho phép chỉ định tham số đầu vào khi chạy
            pst.setString(1, tk);
            pst.setString(2, mk);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(login_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}

