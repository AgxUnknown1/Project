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
public class Method {
    int  num1;
    String name;
    String address;
    
    //no return type and not parameterized
    public void method_one(){
        System.out.println("I have no return type and no parameter");
    }
    
    //no return type but parameterized
    public static void method_two(String out){
        System.out.println(out);
    }
    
    //return type but not parameterized
    public static int method_three(){
        int a,b,c;
        a=b=10;
        c=a+b;
        return c;
    }
    
    //return type and parameter
    public static int method_four(int a, int b, int c){
        c=a+b;
        return c;
    }
    
}
