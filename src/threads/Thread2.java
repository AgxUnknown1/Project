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
public class Thread2 extends Thread {
    String name;
    int num1,num2;
    long interval;
    
    
    public Thread2(String name,int num1,int num2,int interval){
        this.name=name;
        this.num1=num1;
        this.num2=num2;
        this.interval=interval;
    }
    
    @Override
    public void run(){
        for(;num1<=num2;num1++){
            System.out.println(name+" : "+num1);
            try{
                Thread.sleep(interval);
            }
            catch(Exception e){
                System.out.println("Error"+e);
            }
        }
    }
}
