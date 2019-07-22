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

public class GUI implements ActionListener{
    JFrame frame;
    JLabel lbl1,lbl2,lbl3;
    JTextField txt1,txt2,txt3;
    JButton btn1,btn2;
    
    public GUI(){
 
        frame=new JFrame();//creating a new frame
        frame.setSize(450,500);
        frame.setTitle("New Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        //creating label object
        lbl1=new JLabel();
        lbl1.setText("First number:");
        
        lbl2=new JLabel();
        lbl2.setText("Second number");
        
        lbl3=new JLabel();
        lbl3.setText("Result: ");
        
        //creating text object
        txt1=new JTextField();
        txt1.setColumns(10);//setting the width of the textfield
        
        txt2=new JTextField();
        txt2.setColumns(10);//setting the width of the textfield
        
        txt3=new JTextField();
        txt3.setColumns(10);//setting the width of the textfield
        
        //creating a button
        btn1=new JButton("Add");
        btn1.addActionListener(this);
        
        btn2=new JButton();
        btn2.setText("Close");
        btn2.addActionListener(this);
        
        
        frame.setLayout(new FlowLayout());
        
        frame.add(lbl1);
        frame.add(txt1);
        frame.add(lbl2);
        frame.add(txt2);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(lbl3);
        frame.add(txt3);
        
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
       
        if(ae.getSource().equals(btn1)){
            System.out.println("Button1");
            int num1,num2,num3;
            
            num1=Integer.parseInt(txt1.getText());
            num2=Integer.parseInt(txt2.getText());
            num3=num1+num2;
            System.out.println(num3);
            txt3.setText(Integer.toString(num3));
        }
        else if(ae.getSource().equals(btn2)){
            System.exit(0);
        }
    }
   
}
