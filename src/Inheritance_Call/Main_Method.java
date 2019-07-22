/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance_Call;
import Inheritance.Version_1;
import Inheritance.Version_2;
import Inheritance.Version_3;
/**
 *
 * @author user
 */
public class Main_Method {
    public static void main(String[]args){
        
        
        Version_2 two=new Version_2(1,"Saswat",98414345,"Sunakothi");
        System.out.println(two);
        
        Version_2 three=new Version_2(two);
        System.out.println(three);
        
        Version_3 thre=new Version_3(1,"Saswat",98414345,"Sunakothi",98678909,"No 32");
        System.out.println(thre);
        
        Version_3 four=new Version_3(thre);
        System.out.println(four);
        
        
    }
}
