/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDatabase;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    int number;
    
    public Main(){
        do{
            System.out.println("");;
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Display All ");
            System.out.println("0. Exit ");
            System.out.println("Choose an option: ");
            number= new Scanner(System.in).nextInt();
            
            if(number<=5){
                switch(number){
                    case 1:
                        new DBInsert();
                        break;
                    case 2:
                        new DBSearch();
                        break;
                    case 3:
                        new DBUpdate();
                        break;
                    case 4:
                        new DBDelete();
                        break;
                    case 5:
                        new DBSelect();
                        break;
                }
            } 
        }
        while(number!=0);
    }
    
    public static void main(String[]args){
        new Main();
    }
}
