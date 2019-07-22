/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DBSearch {
    String url="jdbc:mysql://localhost/db_practice";
    String username="root";
    String password="";
    int id;
    String name;
    String address;
    
    public DBSearch(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful");
            
            
            System.out.println("Enter the id:");
            id=new Scanner(System.in).nextInt();
            
            String sql="SELECT * FROM practice_person where id=?";//Display specific data
            PreparedStatement pr=conn.prepareStatement(sql);

            pr.setInt(1,id);
            
            ResultSet rs=pr.executeQuery();
   
            while(rs.next()==true){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
            System.out.println("Values displayed");
            conn.close();
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
    }
    
    public DBSearch(int id){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful");
            
            String sql="SELECT * FROM practice_person where id=?";//Display specific data
            PreparedStatement pr=conn.prepareStatement(sql);

            pr.setInt(1,id);
            
            ResultSet rs=pr.executeQuery();
   
            while(rs.next()==true){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
           
           
            conn.close();
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
    }
    
    public static void main(String[]args){
        new DBSearch();
    }  
}
