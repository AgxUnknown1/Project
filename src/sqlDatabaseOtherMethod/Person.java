/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDatabaseOtherMethod;

/**
 *
 * @author user
 */
public class Person {
    int id;
    String name;
    String address;
    
    public Person(){
        this.id=0;
        this.name="";
        this.address="";
    }
    
    public Person(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    
    public Person(Person p){
        this.id=p.id;
        this.name=p.name;
        this.address=p.address;
    }
    
    public void setID(int id){
        this.id=id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public int getId(){
        return(this.id);
    }
    
    public String getName(){
        return(this.name);
    }
    
    public String getAddress(){
        return(this.address);
    }
    
    @Override
    public String toString(){
        return("Id: "+this.id+" Name: "+this.name+" Address: "+this.address);
    }
}
