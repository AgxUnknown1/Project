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
public class Version_2 extends Version_1 {
    long number;
    String address;
    
    public Version_2(){
        super();
        this.number=0;
        this.address="";
    }
    
    public Version_2(int id,String name,long number,String address){
        super(id,name);
        this.number=number;
        this.address=address;
    }
    
    public Version_2(Version_2 two){
        super.setId(two.getId());
        super.setName(two.getName());
        this.number=two.number;
        this.address=two.address;
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
    public int getId(){
        return(super.getId());
    }
   
    @Override
    public String getName(){
        return(super.getName());
    }
   
    
    public void setNumber(long number){
        this.number=number;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public long getNumber(){
        return(this.number);
    }
    
    public String getAddress(){
        return(this.address);
    }
    
    public String toString(){
        return(super.toString()+" Number:"+this.number+" Address:"+this.address);
    }
    
}
