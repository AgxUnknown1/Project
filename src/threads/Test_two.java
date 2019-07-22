/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author user
 */
public class Test_two {
    public static void main(String[]args){
        Thread2 t1,t2;
        t1=new Thread2("Thread1",1,1000,500);
        t2=new Thread2("Thread2",1001,2000,1000);
        t1.start();
        t2.start();
    }
}
