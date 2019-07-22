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
public class Practice {
    String name;
    int id;
    int mark1;
    int mark2;
    int total;
    int average;
    String result;
    
    
    //default values
    public Practice(){
        this.id=0;
        this.name="";
        this.mark1=0;
        this.mark2=0;
        this.total=0;
        this.average=0;
        this.result="";
    }
    
    //parameterized constructor
    //used to take user inputs
    //all values are updated if one value is updated
    public Practice(int id,String name, int mark1, int mark2){
        this.id=id;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        
    }
    
    //copy constructor
    public Practice(Practice obj){
        this.id=obj.id;
        this.name=obj.name;
        this.mark1=obj.mark1;
        this.mark2=obj.mark2;
        this.total=obj.total;
        this.average=obj.average;
        this.result=obj.result;
    }
    
    //used to retrieve/get all values at a time
    public String toString(){
        return("Id: "+id+" Name: "+name+" Mark1: "+mark1+" Mark2: "+mark2+" Total: "+total+" Average: "+average+" Result: "+result);
    }
    
    //setter method
    //used to set value for one at a time
    public void setName(String name){
        this.name=name;
    }
    
    //getter method
    //used to retrieve/get individual values
    public int getTotal(){
        return(this.total);
    }
    
    public void total(){
        this.total=this.mark1+this.mark2;
    }
    
    public void average(){
        this.average=this.total/2;
    }
    
    public void result(){
        if(this.mark1>=40&&this.mark2>=40){
            result="PASS";
        }
        else{
            result="FAIL";
        }
    }
}
