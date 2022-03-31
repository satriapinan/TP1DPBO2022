/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1dpbo2022;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class dbConnection {
    public static Connection con;
    public static Statement stm;
    
    public void connect(){//untuk membuka koneksi ke database
        try {
            String url ="jdbc:mysql://localhost/dbtp1dpbo";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
    public DefaultTableModel readAuthor(){
        
        DefaultTableModel dataTabel = null;
        try{
            Object[] column = {"Image", "Nama", "Jumlah Buku"};
            connect();
            dataTabel = new DefaultTableModel(null, column);
            String sql = "Select image,nama,jumlah_buku from dbauthor_tp1";
            ResultSet res = stm.executeQuery(sql);
            
            int no = 1;
            while(res.next()){
                Object[] hasil = new Object[3];
                hasil[0] = res.getString("image");
                hasil[1] = res.getString("nama");
                hasil[2] = res.getString("jumlah_buku");
                System.out.print(hasil[1]);
                dataTabel.addRow(hasil);
            }
        }catch(Exception e){
            System.err.println("Read gagal " +e.getMessage());
        }
        
        return dataTabel;
    }
    public DefaultTableModel readBook(){
        
        DefaultTableModel dataTabel = null;
        try{
            Object[] column = {"Image", "Penerbit", "Author", "Description"};
            connect();
            dataTabel = new DefaultTableModel(null, column);
            String sql = "Select image,penerbit,author,description from dbbook_tp1";
            ResultSet res = stm.executeQuery(sql);
            
            int no = 1;
            while(res.next()){
                Object[] hasil = new Object[4];
                hasil[0] = res.getString("image");
                hasil[1] = res.getString("penerbit");
                hasil[2] = res.getString("author");
                hasil[3] = res.getString("description");
                System.out.print(hasil[1]);
                dataTabel.addRow(hasil);
            }
        }catch(Exception e){
            System.err.println("Read gagal " +e.getMessage());
        }
        
        return dataTabel;
    }
    
    public void Query(String inputan){
        
        try{
            connect();
            String sql = inputan;
            stm.execute(sql);
            
        }catch(Exception e){
            System.err.println("Read gagal " +e.getMessage());
        }
        
    }
}
