/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DBDelete {
    String url="jdbc:mysql://localhost/db_practice";
    String username="root";
    String password="";
    int id=0;
    String name="";
    String address="";
    
    public DBDelete(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful");
            
            System.out.println("Enter your id:");
            id=new Scanner(System.in).nextInt();
            
            String sql="DELETE FROM practice_person WHERE id=?";
            PreparedStatement pr=conn.prepareStatement(sql);
            
            pr.setInt(1,id);
            
            pr.executeUpdate();
            System.out.println("Values deleted");
            conn.close();
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
    }
    
    public DBDelete(int id){
       
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            
            String sql="DELETE FROM practice_person WHERE id=?";
            PreparedStatement pr=conn.prepareStatement(sql);
            
            pr.setInt(1,id);
            
            pr.executeUpdate();
            System.out.println("Values deleted");
            conn.close();
            
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
       
    }
    
    public static void main(String[]args){
        new DBDelete();
    }
}
