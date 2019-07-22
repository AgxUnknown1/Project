/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDatabase;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author user
 */
public class DBConnect {
    String url="jdbc:mysql://localhost/db_practice";
    String username="root";
    String pw="";
    public DBConnect(){
        try{
        Class.forName("org.gjt.mm.mysql.Driver");//loading driver
        Connection conn=DriverManager.getConnection(url,username,pw);//creating a connection
        System.out.println("Connection Successful");
        conn.close();
        }
        catch(Exception e){
            System.out.println("Errror"+e);
        }
    }
    
    public static void main(String[]args){
        new DBConnect();
    }
            
}
