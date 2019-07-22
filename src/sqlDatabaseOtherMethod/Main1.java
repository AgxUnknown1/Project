/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDatabaseOtherMethod;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author user
 */
public class Main1 implements ActionListener {
    JFrame frame;
    JLabel lbl_id,lbl_name,lbl_address;
    JTextField  txt_id,txt_name,txt_address;
    JButton  btn_save,btn_close,btn_update,btn_displayAll,btn_search,btn_delete;
    
    public Main1(){
        frame=new JFrame();
        frame.setTitle("Database");
        frame.setSize(400,500);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        //creating labels
        lbl_id=new JLabel("ID:");
        
        lbl_name=new JLabel("Name:");
        
        lbl_address=new JLabel();
        lbl_address.setText("Address");
        
         //creating textfields
        txt_id=new JTextField();
        txt_id.setColumns(30);
        
        txt_name=new JTextField();
        txt_name.setColumns(30);
        
        txt_address=new JTextField();
        txt_address.setColumns(30);
        
        btn_save=new JButton("Save");
        btn_save.addActionListener(this);
        
        btn_close=new JButton("Close");
        btn_close.addActionListener(this);
        
         btn_update=new JButton("Update");
        btn_update.addActionListener(this);
        
        btn_displayAll=new JButton("Display All");
        btn_displayAll.addActionListener(this);
        
        btn_search=new JButton("Search");
        btn_search.addActionListener(this);
        
        btn_delete=new JButton("Delete");
        btn_delete.addActionListener(this);
        
        
        frame.add(lbl_id);
        frame.add(txt_id);
        frame.add(lbl_name);
        frame.add(txt_name);
        frame.add(lbl_address);
        frame.add(txt_address);
        frame.add(btn_save);
        frame.add(btn_update);
        frame.add(btn_displayAll);
        frame.add(btn_search);
        frame.add(btn_delete);
        frame.add(btn_close);
        
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        
        //searching for specific data
        if(e.getSource().equals(btn_search)){
            System.out.println("SEARCHING");
            int id;
            id=Integer.parseInt(txt_id.getText());
            Person p=new DBSearch().searchPerson(id);
            
            
            if(p.name!=""&&p.address!=""){
                txt_id.setText(Integer.toString(p.id));
                txt_name.setText(p.name);
                txt_address.setText(p.address);
                System.out.println("Successful");
            }
            else{
                System.out.println("Record not found");
            } 
        }
        
        else if (e.getSource().equals(btn_update)){
            int id;
            String name;
            String address;
            
            id=Integer.parseInt(txt_id.getText());
            name=txt_name.getText();
            address=txt_address.getText();
            
            Person p=new Person(id,name,address);
            new DBUpdate().updatePerson(p);
            
            System.out.println("Successful");
          
        }
       
        else if(e.getSource().equals(btn_close)){
            System.exit(0);
        }
    }
    public static void main(String[]args){
        new Main1();
    }
}
