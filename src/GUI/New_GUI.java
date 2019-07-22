/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
        
/**
 *
 * @author user
 */
public class New_GUI extends JFrame implements ActionListener{
    
    JLabel num1lbl,num2lbl,num3lbl,num4lbl,sub1lbl,sub2lbl,totallbl,averagelbl,resultlbl;
    JTextField num1txt,num2txt,resulttxt,num3txt,num4txt,sub1txt,sub2txt,totaltxt,averagetxt;
    JButton calculate,save,close;
    
        public New_GUI(){
                setSize(350,400);
                setResizable(false);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("My frame");
                
                //setting a layout
                //determining the positions of all the elements for eg:textfield,labels
                setLayout(new FlowLayout());
                
                //creating labels
                num1lbl=new JLabel();//creating a label object
                num1lbl.setText("Id: ");//setting the name of the label
                
                num2lbl=new JLabel();
                num2lbl.setText("Name: ");
                
                num3lbl=new JLabel();
                num3lbl.setText("Grade: ");
                
                num4lbl=new JLabel();
                num4lbl.setText("Section: ");
                
                sub1lbl=new JLabel();
                sub1lbl.setText("Sub1: ");
                
                sub2lbl=new JLabel();
                sub2lbl.setText("Sub2: ");
                
                totallbl=new JLabel();
                totallbl.setText("Total: ");
                
                averagelbl=new JLabel();
                averagelbl.setText("Average: ");
                
                resultlbl=new JLabel();
                resultlbl.setText("Result: ");
                
                //creating textfields
                num1txt=new JTextField();//creating a textfield object
                num1txt.setColumns(10);//setting the width of the textfield
                
                num2txt=new JTextField();
                num2txt.setColumns(10);
                
                num3txt=new JTextField();
                num3txt.setColumns(10);
                
                num4txt=new JTextField();
                num4txt.setColumns(10);
                
                sub1txt=new JTextField();
                sub1txt.setColumns(10);     
                
                sub2txt=new JTextField();
                sub2txt.setColumns(10); 
                
                totaltxt=new JTextField();
                totaltxt.setColumns(10);
                
                averagetxt=new JTextField();
                averagetxt.setColumns(10);
                
            
                resulttxt=new JTextField();
                resulttxt.setColumns(30);
                
                //creating buttons
                calculate=new JButton();//creating a button object
                calculate.setText("Calculate");//setting the text for the button
                calculate.addActionListener(this);
                
                save=new JButton();
                save.setText("Save");
                save.addActionListener(this);
                
                close=new JButton();
                close.setText("Close");
                close.addActionListener(this);
               
                
                add(num1lbl);
                add(num1txt);
                add(num2lbl);
                add(num2txt);
                add(num3lbl);
                add(num3txt);
                add(num4lbl);
                add(num4txt);
                add(sub1lbl);
                add(sub1txt);
                add(sub2lbl);
                add(sub2txt);
                add(resultlbl);
                add(resulttxt);
                add(totallbl);
                add(totaltxt);
                add(averagelbl);
                add(averagetxt);
                add(calculate);
                add(save);
                add(close);
                
                
                setVisible(true);
                
        }
        
        @Override
        public void actionPerformed(ActionEvent ae){
            //if user clicks calculate button
            if(ae.getSource().equals(calculate)){
               //declaring variables
                double sub1,sub2,total,average;
                String result;
                
                //retrieving the marks from the textfields
                sub1=Double.parseDouble(sub1txt.getText());
                sub2=Double.parseDouble(sub2txt.getText());
                
                //process
                total=sub1+sub2;//calculating total
                average=total/2;//calculating average
                
                //calculating result
                if(average>40){
                    result="PASS";
                    
                }
                else{
                    result="FAIL";
                }
                
                totaltxt.setText(Double.toString(total));
                averagetxt.setText(Double.toString(average));
                resulttxt.setText(result);
                
                System.out.println("Hello");
            }
            //if user clicks close button
            else if(ae.getSource().equals(close)){
                System.exit(0);
                System.out.println("Close");
            }
        }
        
    public static void main(String[]args){
        new New_GUI();
    }
        
        
}
