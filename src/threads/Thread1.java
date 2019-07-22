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
public class Thread1 extends Thread {
    String name;
    int num1,num2;
    
    public Thread1(String name,int num1,int num2){
        this.name=name;
        this.num1=num1;
        this.num2=num2;
    }
    
    @Override
    public void run(){
      
        for(;num1<=num2;num1++){
            System.out.println(name+" : "+num1);
        }
    }
    
}
