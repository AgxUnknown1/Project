/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author user
 */
public class Interface_Call implements Interface1,Interface2 {
    
    @Override
    public void one(){
        System.out.println("One");
    }
    @Override
    public void two(){
        System.out.println("Two");
    }
    
    public static void main(String[]args){
        
        Interface1 obj1=new Interface_Call();
        obj1.one();
        
        Interface2 obj2=new Interface_Call();
        obj2.two();
        
        new Interface_Call().one();
        new Interface_Call().two();
        
        //creating object of current class
        Interface_Call obj3=new Interface_Call();
        obj3.one();
        obj3.two();
        
        //creating object of interfaces_call class
        Interfaces_Class obj4;
        obj4=new Interfaces_Class();
        obj4.one();
        obj4.two();
        
        Interface1 obj5;
        Interface2 obj6;
        
        obj5=new Interfaces_Class();
        obj5.one();
        
        obj6=new Interfaces_Class();
        obj6.two();
        
        
    }
}
