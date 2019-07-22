/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_call;
import accessSpecifiers.AccessSpecifiers;
/**
 *
 * @author user
 */
public class as_call  {
    public static void main(String[]args){
   
        AccessSpecifiers p=new AccessSpecifiers();
        //protected access specifier
        //num3=10;
        //public access specifier
        p.num2=10;
        
        System.out.println(p.num2);
       // System.out.println(num3);
   
   }
}
