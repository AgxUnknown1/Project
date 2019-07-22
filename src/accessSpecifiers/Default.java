/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessSpecifiers;

/**
 *
 * @author user
 */
public class Default {
    public static void main(String[]args){
        AccessSpecifiers s=new AccessSpecifiers();
        
        //default access specifier
        s.num1=10;
        System.out.println(s.num1);
        
        //public access specifier
        s.num2=20;
        System.out.println(s.num2);
        
        //protected
        s.num3=30;
        System.out.println(s.num3);
        
    }
}
