/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author user
 */
public class Interfaces_Class implements Interface1,Interface2 {
    
    @Override
    public void one(){
        System.out.println("One from different class");
    }
    
    @Override
    public void two(){
        System.out.println("Two from different class");
    }
}
