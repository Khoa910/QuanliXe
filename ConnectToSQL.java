/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 * This program demonstrates how to establish database connection to Microsoft
 * SQL Server.
 * @author www.codejava.net
 *
 */
public class ConnectToSQL {

    private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL="jdbc:sqlserver://localhost:1433;databaseName=DANGNHAP;" + "encrypt=true;trustServerCertificate=true";
    private static final String USER="Kiranto";
    private static final String PASS="123456";
    public static Connection openConnection(){
        Connection conn=null;
        try {
            Class.forName(DRIVER);
            try {
                conn=DriverManager.getConnection(URL,USER,PASS);
            } catch (SQLException ex) {
               
            }
        } catch (ClassNotFoundException ex) {
             System.out.println("Không Thể Kết Nối Tới Cơ Sở Dữ Liệu");
        }
        return conn;
    }
    public static void closeConnection(Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectToSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
