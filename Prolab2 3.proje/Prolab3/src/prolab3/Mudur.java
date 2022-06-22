
package prolab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Mudur {
      
    private Connection con = null;
    private Statement statement =null;
    private PreparedStatement preparedStatement=null; 
    
    
    public boolean mudurgirisDogrulama(String mudurtcno, String mudursifre){
        
           
        String sorgu = new String("Select * FROM banka_mudur WHERE bankamuduru_tc = ? and bankamuduru_sifre= ?");
        
        
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setString(1, mudurtcno);
             preparedStatement.setString(2, mudursifre); 
             
             ResultSet rs = preparedStatement.executeQuery();
             
             
            return rs.next();
                
             
             
            
        } catch (SQLException ex) {
            Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    
    
    void parabirimiekle(String parabirimiad, int parabirimifiyat){
        
        String query = "Insert into para_birimi(para_birimi_ad, kur_fiyat) values(?, ?)";
                
        preparedStatement = con.prepareStatement(query);
        
        preparedStatement.setString(1, parabirimiad);
        preparedStatement.setInt(2, parabirimifiyat);
        preparedStatement.executeUpdate();
        
  
        
    }
        
    void parabirimiguncelle(String parabirimiad, int parabirimifiyat){
        
        
          String query="Update para_birimi Set kur_fiyat= ? Where para_birimi_ad= ?";
        
        
        try {
            preparedStatement=con.prepareStatement(query);
            
           preparedStatement.setInt(1, parabirimifiyat);
           preparedStatement.setString(2, parabirimiad);
           
            preparedStatement.executeUpdate();
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Mudur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    void maasguncelle(int guncellenecekmaas){
        
        String query = "Update musteri_temsilcisi set musterit_maas=?";
        
        try {
            preparedStatement=con.prepareStatement(query);
            preparedStatement.setInt(1, guncellenecekmaas);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Mudur.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }
    
    
    void musteriekle(String ad,String soyad, String tcno, String adres,String eposta,String sifre,String telefon,int temsilciid){
        
     
        String query = "Insert Into musteri(musteri_tcno,musteri_ad,musteri_soyad,musteri_adres,musteri_telno,musteri_eposta,musteri_sifre,musterit_id) Values(?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, tcno);
        
        preparedStatement.setString(2, ad);
        preparedStatement.setString(3, soyad);
        preparedStatement.setString(4, adres);
        preparedStatement.setString(5,telefon);
        preparedStatement.setString(6, eposta);
        preparedStatement.setString(7, sifre);
        preparedStatement.setInt(8, temsilciid);
        
        preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Mudur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
    
    
    void musterigoruntule(){
        
        
        statement=con.createStatement();
        
        
        
    }
    
    
    
    
    
     public Mudur(){
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
    
    
    
    
    
}
