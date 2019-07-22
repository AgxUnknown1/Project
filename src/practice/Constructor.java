/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author user
 */
public class Constructor {
    int roll_no;
    String name;
    String address;
    
    //default constructor
    //default values halnu paryo vaney
    public Constructor(){
        this.roll_no=0;
        this.name="";
        this.address="";
    }
    
    //parameterized constructor
    //used for user given values
    public Constructor(int roll_no,String name,String address){
        this.roll_no=roll_no;
        this.name=name;
        this.address=address;
    }
    
    //Copy constructor
    public Constructor(Constructor obj1){
        this.roll_no=obj1.roll_no;
        this.name=obj1.name;
        this.address=obj1.address;
    }
    
    public String toString(){
        return("Roll_no: "+roll_no+"Name: "+name+" Address: "+address);
    }
    
}

