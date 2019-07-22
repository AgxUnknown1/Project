/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author user
 */
public class Version_1 {
    int id;
    String name;
    
    public Version_1(){
        this.id=0;
        this.name="";
    }
    
    public Version_1(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    public Version_1(Version_1 one){
        this.id=one.id;
        this.name=one.name;
    }
    
  
    public void setId(int id){
        this.id=id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public int getId(){
        return(this.id);
    }
    
    public String getName(){
        return(this.name);
    }
    
     public String toString(){
        return(" Id:"+this.id+" Name:"+this.name);
    }
         
}
