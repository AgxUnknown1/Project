/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDatabase;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author user
 */
public class Main_GUI_Database implements ActionListener {
    JFrame frame;
    JLabel lbl_id,lbl_name,lbl_address;
    JTextField  txt_id,txt_name,txt_address;
    JButton  btn_save,btn_close,btn_update,btn_displayAll,btn_search,btn_delete;
    
    public Main_GUI_Database(){
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
        //inserting values
        if(e.getSource().equals(btn_save)){
            int id;
            String name;
            String address;
            //if all the text fields are filled insert the values
            if(!(txt_id.getText().equals(""))&&!(txt_name.getText().equals(""))&&!(txt_address.getText().equals(""))){
                
            id=Integer.parseInt(txt_id.getText());
            name=txt_name.getText();
            address=txt_address.getText();
            
            new DBInsert(id,name,address);
            }
            //else print a message to fill the fields
            else{
                System.out.println("Please fill all the fields");
            }
        }
        
        //updating values
        else if(e.getSource().equals(btn_update)){
            
            int id;
            String name;
            String address;
            
            //if all the text fields are filled insert the values
            if(!(txt_id.getText().equals(""))&&!(txt_name.getText().equals(""))&&!(txt_address.getText().equals(""))){
            id=Integer.parseInt(txt_id.getText());
            name=txt_name.getText();
            address=txt_address.getText();
            
            new DBUpdate(id,name,address);
            
            }
            //else print a message to fill the fields
            else{
                System.out.println("Please fill all the fields");
            }
            
        }
        
        //displaying all the data
        else if(e.getSource().equals(btn_displayAll)){
            new DBSelect();
        }
        
        //searching for specific data
        else if(e.getSource().equals(btn_search)){
            int id;
            
            if(!(txt_id.getText().equals(""))){
                id=Integer.parseInt(txt_id.getText());
                
                new DBSearch(id);
                 System.out.println("Values displayed");
            }
            else{
                System.out.println("Please specify the id you want to search");
            }
        }
        
        //delete specific data
        else if(e.getSource().equals(btn_delete)){
            int id;
            
            if(!(txt_id.getText().equals(""))){
                id=Integer.parseInt(txt_id.getText());
                
                new DBDelete(id);
            }
            else{
                System.out.println("Please specify the id you want to search");
            }
            
        }
        
        else if(e.getSource().equals(btn_close)){
            System.exit(0);
        }
    }
    public static void main(String[]args){
        new Main_GUI_Database();
    }
}
