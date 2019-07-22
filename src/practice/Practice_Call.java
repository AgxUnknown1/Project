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
public class Practice_Call {
    public static void main(String[]args){
       Practice p1=new Practice();
       Practice p2;
       Practice p3;
       
       //default
       p1.id=1;
       p1.name="Default";
       p1.mark1=10;
       p1.mark2=10;
       p1.total=20;
       p1.average=10;
       p1.result="FAIL";
       System.out.println(p1);
       
       //parameterized
       p2=new Practice(1,"Parameterized",50,50);
       p2.setName("Saswat");
       p2.total();
       p2.average();
       System.out.println(p2);
       System.out.println(p2.getTotal());
       
       //copy constructor
       p3=new Practice(p2);
       System.out.println(p3);
        
    }
}
