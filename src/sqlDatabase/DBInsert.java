/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDatabase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DBInsert {
    String url="jdbc:mysql://localhost/db_practice";
    String username="root";
    String password="";
    int id;
    String name="";
    String address="";
    
    public DBInsert(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            
            System.out.println("Enter your id: ");
            id=new Scanner(System.in).nextInt();
            System.out.println("Enter your name: ");
            name=new Scanner(System.in).nextLine();
            System.out.println("Enter your address: ");
            address=new Scanner(System.in).nextLine();
            
            String sql="INSERT INTO practice_person(id,name,address) VALUES (?,?,?)";
            PreparedStatement pr=conn.prepareStatement(sql);
            
            pr.setInt(1,id);
            pr.setString(2,name);
            pr.setString(3,address);
            
            pr.executeUpdate();
            System.out.println("Values added");
            conn.close();
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
    }
    
    public DBInsert(int id,String name,String address){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            
            String sql="INSERT INTO practice_person(id,name,address) VALUES (?,?,?)";
            PreparedStatement pr=conn.prepareStatement(sql);
            
            pr.setInt(1,id);
            pr.setString(2,name);
            pr.setString(3,address);
            
            pr.executeUpdate();
            System.out.println("Values added");
            conn.close();
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
    }
    
    public static void main(String[]args){
        new DBInsert();
    }
}
