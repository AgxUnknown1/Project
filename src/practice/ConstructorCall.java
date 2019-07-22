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
public class ConstructorCall {
    public static void main(String[]args){
        //declaring a class
        Constructor de_fault;
        Constructor parameter;
        Constructor copy;
        /************************Default constructor****************************/
        de_fault=new Constructor();//creating a new object
        
        //inserting values in default constructor
        de_fault.roll_no=1;
        de_fault.name="I am a constructor";
       
        System.out.println("roll no: "+de_fault.roll_no+" Name: "+de_fault.name);
        
        /**********************Parameterized Constructor**************************/
        parameter=new Constructor(1,"I am a parameterizd constructor","No");
        System.out.println("Roll no: "+parameter.roll_no+" Name: "+parameter.name+" Address: "+parameter.address);
        
        /***********************Copy Constructor**********************************/
        copy=new Constructor(parameter);
        System.out.println(copy);
        
        
        
        
    }
}
