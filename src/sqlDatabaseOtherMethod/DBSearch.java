/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDatabaseOtherMethod;

import java.util.Scanner;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

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
    
    public void searchPerson(){
        try{
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection conn=DriverManager.getConnection(url,username,password);
        
        System.out.println("Enter your id:");
        int id=new Scanner(System.in).nextInt();
        
        String sql="SELECT * FROM practice_person where id=?";
        PreparedStatement pr=conn.prepareStatement(sql);
        pr.setInt(1,id);
     
        ResultSet sr=pr.executeQuery();
        
        while(sr.next()==true){
            System.out.println("ID:"+sr.getInt(1)+" Name :"+sr.getString(2)+" Address: " +sr.getString(3) );
        }
        
        
        }
        catch(Exception e){
            System.out.println("Error!!!"+e);
        }
       
    }
    public Person searchPerson(int id){
        Person p=new Person();
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            
            String sql="SELECT * FROM practice_person WHERE ID=?";
            PreparedStatement pr=conn.prepareStatement(sql);
            
            pr.setInt(1, id);
            
            ResultSet rs=pr.executeQuery();
           
            while(rs.next()==true){
                p=new Person(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
            
            conn.close();
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
        return(p);
    }
     public static void main(String[]args){
            new DBSearch();
        }
}
