/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prolab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Temsilci {
    
    
    
    private Connection con = null;
    private Statement statement =null;
    private  PreparedStatement preparedStatement=null; 
    
    
    public boolean temsilcigirisDogrulama(String temsilcitcno, String temsilcisifre){
        
         String query = new String("Select * FROM musteri_temsilcisi WHERE musterit_tc = ? and musterit_sifre= ?");
        
        
        try {
            preparedStatement =con.prepareStatement(query);
            preparedStatement.setString(1, temsilcitcno);
             preparedStatement.setString(2, temsilcisifre); 
             
             ResultSet rs = preparedStatement.executeQuery();
             
             
            return rs.next();
                
             
             
            
        } catch (SQLException ex) {
            Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    
    
    boolean musterikontrol(int musteritemsilciid,String islemyapilacakmusteritc){
        
        String sorgu="Select musterit_id From musteri where musteri_tcno=?";
        
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, islemyapilacakmusteritc);
            preparedStatement.executeQuery();
            
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Temsilci.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
    }    
    
    
    void adresguncelle(String musteritcno, String guncellenecekadres){
        
        String query ="Update musteri set musteri_adres=? where musteri_tcno=?";
        
        
        try {
            preparedStatement=con.prepareStatement(query);
            
            preparedStatement.setString(1, guncellenecekadres);
            preparedStatement.setString(2, musteritcno);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Temsilci.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    void telefonguncelle(String musteritcno, String guncellenecektelefon){
        
        String query ="Update musteri set musteri_telno=? where musteri_tcno=?";
        
        
        try {
            preparedStatement=con.prepareStatement(query);
            
            preparedStatement.setString(1, guncellenecektelefon);
            preparedStatement.setString(2, musteritcno);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Temsilci.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    void epostaguncelle(String musteritcno,String guncellenecekeposta){
        
              String query ="Update musteri set musteri_eposta=? where musteri_tcno=?";
        try {
            preparedStatement=con.prepareStatement(query);
            
            preparedStatement.setString(1, guncellenecekeposta);
            preparedStatement.setString(2, musteritcno);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Temsilci.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void sifreguncelle(String musteritcno,int guncelleneceksifre){
        
        String query ="Update musteri set musteri_sifre=? where musteri_tcno=?";
        try {
            preparedStatement=con.prepareStatement(query);
            
            preparedStatement.setInt(1, guncelleneceksifre);
            preparedStatement.setString(2, musteritcno);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Temsilci.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
        
        
        
    
        
        
        
        
    
    
    
    
    public Temsilci(){
   
     String url = "jdbc:mysql://" + VeriTabani.host + ":" + VeriTabani.port + "/" + VeriTabani.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
             
        try {
            
           Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
                
        try {
            con = DriverManager.getConnection(url, VeriTabani.kullanici_adi, VeriTabani.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            
        }
        
}

    
    public static void main(String[] args) {
        
    }
    
}
    
    
    
