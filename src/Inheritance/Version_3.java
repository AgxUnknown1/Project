/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author user
 */
public class Version_3 extends Version_2 {
    public int contact;
    String street_no;
    
    public Version_3(){
        super();
        this.contact=0;
        this.street_no="";
    }
    
    public Version_3(int id,String name,long number,String address,int contact,String street_no){
        super(id,name,number,address);
        this.contact=contact;
        this.street_no=street_no;
    }
    
    public Version_3(Version_3 three){
        super.setId(three.getId());
        super.setName(three.getName());
        super.setNumber(three.getNumber());
        super.setAddress(three.getAddress());
        this.contact=three.contact;
        this.street_no=three.street_no;
    }
    
    @Override
    public void setId(int id){
       super.setId(id);
    }
    
    @Override
    public void setName(String name){
        super.setName(name);
    }
    
     @Override
    public void setNumber(long number){
       super.setNumber(number);
    }
    
    @Override
    public void setAddress(String address){
        super.setAddress(address);
    }
    
    public void setContact(int contact){
        this.contact=contact;
    }
    
    public void setStreetNo(String street){
        this.street_no=street;
    }
    
    public int getContact(){
        return(this.contact);
    }
    
    public String getStreeNos(){
        return(this.street_no);
    }
    
    @Override
    public int getId(){
        return(super.getId());
    }
   
    @Override
    public String getName(){
        return(super.getName());
    }
   
    @Override
    public long getNumber(){
        return(super.getNumber());
    }
    
    @Override
    public String getAddress(){
        return(super.getAddress());
    }
    
    @Override
    public String toString(){
        return(super.toString()+" Contact:"+contact+" Street_No:"+street_no);
    }
    
    
}
