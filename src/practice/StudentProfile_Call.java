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
public class StudentProfile_Call {
    public static void main(String[]args){
        //declaring a class
        StudentProfile de_fault;
        StudentProfile parameterized;
        StudentProfile copy;
        
        de_fault=new StudentProfile();//creating an object
        
        de_fault.id=1;
        de_fault.name="Default";
        de_fault.mark1=50;
        de_fault.mark2=50;
        de_fault.calculateTotal();
        de_fault.calculateAverage();
        de_fault.calculateGrade();
        de_fault.result();
        
        //Parameterized constructor
        parameterized=new StudentProfile(2,"Parameterized",100,100);
        parameterized.calculateTotal();
        parameterized.calculateAverage();
        parameterized.result();
        parameterized.calculateGrade();
        
        System.out.println(de_fault);
        System.out.println(parameterized);
        
        //copy constructor
        copy=new StudentProfile(de_fault);
        System.out.println(copy);
        
    }
}
