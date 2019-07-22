/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;


public class MethodCall {

    public static void main(String[] args) {
        //declare
        Method m1;
        
//initialise
        m1=new Method();
        m1.num1=1;
        m1.name="Assigning and printing values to variables from different classs";
        
        System.out.println("");
        System.out.println("Num1: "+m1.num1+" Name: "+m1.name+" Address: "+m1.address);
      
        //calling a non static method:object should be created
        //no return type no parameter
        m1.method_one();
        
        //Static method:No need to create object
        //No return type but parameterized
        Method.method_two("I have a parameter but no return type");
        
        int method_three=Method.method_three();
        System.out.println("I have a return type but no parameter: "+method_three);
        
        int method_four=Method.method_four(10,10,10);
        System.out.println("I have a return type and parameter: "+method_four);
        
        
    }
    
}
