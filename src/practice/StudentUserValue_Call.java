/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class StudentUserValue_Call {
    public static void main(String[]args){
        StudentProfile user_value;
        
        int id;
        String name;
        int mark1;
        int mark2;
        int total;
        String grade;
        String result;
        
        System.out.println("Enter your id: ");
        id=new Scanner(System.in).nextInt();
        System.out.println("Enter your name: ");
        name=new Scanner(System.in).nextLine();
        System.out.println("Enter your mark1: ");
        mark1=new Scanner(System.in).nextInt();
        System.out.println("Enter your mark2: ");
        mark2=new Scanner(System.in).nextInt();
        
        
        user_value=new StudentProfile(id,name,mark1,mark2);
        user_value.calculateTotal();
        user_value.calculateAverage();
        user_value.result();
        user_value.calculateGrade();
        
        System.out.println(user_value);
        
    }
}
