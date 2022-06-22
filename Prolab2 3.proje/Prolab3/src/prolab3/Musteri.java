
package prolab3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;







public class Musteri {
    
    
    private Connection con = null;
    private Connection con1=null;
    private Statement statement =null;
    private Statement statement1 =null;
    private PreparedStatement preparedStatement=null; 
    private PreparedStatement preparedStatement1=null;
    
    
    
    public boolean musterigirisDogrulama(String musteritcno, String musterisifre){
   
        
           
        String sorgu = "Select * FROM musteri WHERE musteri_tcno = ? and musteri_sifre= ?";
        
        
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setString(1, musteritcno);
             preparedStatement.setString(2, musterisifre); 
             
             ResultSet rs = preparedStatement.executeQuery();
             
             
            return rs.next();
                
             
             
            
        } catch (SQLException ex) {
            Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    
    
     void paracekme(String islemyapilacakhesap,int cekilecekpara){
        
         String query1 =  "SELECT bakiye FROM hesaplar WHERE hesap_no = ? ";  
          String query2 =  "Update hesaplar set bakiye=? where hesap_no=?";
         
           
            try {
            
            preparedStatement =con.prepareStatement(query1);    
            preparedStatement.setString(1, islemyapilacakhesap);
            ResultSet rs = preparedStatement.executeQuery();                         
         
            
              while(rs.next()){
            
            int eskibakiye= rs.getInt("bakiye");
                 
            int yenibakiye=eskibakiye-cekilecekpara;
            
            
            statement= con.createStatement();
             String query2 =  "Update hesaplar set bakiye='"+yenibakiye+"' where hesap_no="+islemyapilacakhesap;
             statement.executeUpdate(query2);
            
              
                  
        }      
            
            } catch (SQLException ex) {
                Logger.getLogger(MusteriFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            
                 
    }
     
     void parayatirma(String islemyapilacakhesap, int yatirilacakpara){
         
         
          String query1 =  "SELECT bakiye FROM hesaplar WHERE hesap_no = ? ";  
         
         
           
            try {
            
            preparedStatement =con.prepareStatement(query1);    
            preparedStatement.setString(1, islemyapilacakhesap);
            ResultSet rs = preparedStatement.executeQuery();                         
         
            
              while(rs.next()){
            
            int eskibakiye= rs.getInt("bakiye");
                 
            int yenibakiye=eskibakiye+yatirilacakpara;
            
            
            statement= con.createStatement();
             String query2 =  "Update hesaplar set bakiye='"+yenibakiye+"' where hesap_no="+islemyapilacakhesap;
             statement.executeUpdate(query2);
            
              
                  
        }      
            
            } catch (SQLException ex) {
                Logger.getLogger(MusteriFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
          
         
     }
     
     
     void hesapsil(String islemyapilacakhesap){
         
          String query1 =  "SELECT bakiye FROM hesaplar WHERE hesap_no = ? ";  
         
         
           
            try {
            
            preparedStatement =con.prepareStatement(query1);    
            preparedStatement.setString(1, islemyapilacakhesap);
            ResultSet rs = preparedStatement.executeQuery(); 
         
           while(rs.next()){
               
               int bakiye= rs.getInt("bakiye");
               
               if(bakiye==0){
                   statement= con.createStatement();
                   String sorgu="Delete from hesaplar where hesap_no= "+islemyapilacakhesap;
                   statement.executeUpdate(sorgu);
                           
                   
                   
                   
               }
               
               
           }
           
         
         
         
         
     }
     
            catch (SQLException ex) {
                Logger.getLogger(MusteriFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
     }
     
     void adresguncelle(String musteritcno, String guncellenecekadres) {
         
        try {
            statement=con.createStatement();
            
            String query="Update musteri set musteri_adres= '"+guncellenecekadres+"' where musteri_tcno= "+musteritcno;
            
            statement.executeUpdate(query);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
        }
           
         
     }
     
     void telefonguncelle(String musteritcno,String guncellenecektelefon){
         
         
          try {
            statement=con.createStatement();
            
            String query="Update musteri set musteri_telno= '"+guncellenecektelefon+"' where musteri_tcno= "+musteritcno;
            
            statement.executeUpdate(query);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
        }
            
     }
     
     
     void epostaguncelle(String musteritcno, String guncellenecekeposta){
         
          try {
            statement=con.createStatement();
            
            String query="Update musteri set musteri_eposta= '"+guncellenecekeposta+"' where musteri_tcno= "+musteritcno;
            
            statement.executeUpdate(query);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         
         
     }
     
     void krediborcuode(String musterihesapno,int odenecekkredimiktari){
         
         String query= "Select kredi_borcu from hesaplar where hesap_no=?";
         
        try {
            preparedStatement=con.prepareStatement(query);
            
            preparedStatement.setString(1, musterihesapno);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            while(rs.next()){
                
                int eskibakiye= rs.getInt("kredi_borcu");
                int yenibakiye=eskibakiye-odenecekkredimiktari;
                
              statement= con.createStatement();
             String query2 =  "Update hesaplar set kredi_borcu='"+yenibakiye+"' where hesap_no="+musterihesapno;
             statement.executeUpdate(query2);
             
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
         
         
         
         
     }
     
    
    
    public Musteri(){
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
