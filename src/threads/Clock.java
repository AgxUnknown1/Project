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
public class Clock extends Thread{
    int hour,minute,seconds,interval;
    
    public Clock(int hour,int minute,int seconds,int interval){
        this.hour=hour;
        this.minute=minute;
        this.seconds=seconds;
        this.interval=interval;
    }
    
   @Override
   public void run(){
       for(int i=0;;i++){
           ++seconds;
           if(seconds>=60){
               seconds=0;
               minute++;
               if(minute>=60){
                   minute=0;
                   hour++;
               }
           }
           System.out.println(hour+" : "+minute+" : "+seconds);
           try{
               Thread.sleep(interval);
           }
           catch(Exception e){
               System.out.println("Error"+e);
           }
       }
   }
}
