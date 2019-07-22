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
public class Clock_Call {
    public static void main(String[]args){
        Clock c1;
        c1=new Clock(6,59,54,1000);
        c1.start();
    }
}
