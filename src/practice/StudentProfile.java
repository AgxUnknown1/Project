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
public class StudentProfile {
    int id;
    String name;
    int mark1;
    int mark2;
    String grade;
    int total;
    int average;
    String result;
    
    //default constructor
    public StudentProfile(){
        this.id=0;
        this.name="";
        this.mark1=0;
        this.mark2=0;
        
    }
    
    public StudentProfile(int id,String name,int mark1,int mark2){
        this.id=id;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        
    }
    
    public StudentProfile(StudentProfile copy){
        this.id=copy.id;
        this.name=copy.name;
        this.mark1=copy.mark1;
        this.mark2=copy.mark2;
        this.total=copy.total;
        this.average=copy.average;
        this.grade=copy.grade;
        this.result=copy.result;
    }
    
    public String toString(){
        return("Id: "+id+" Name: "+name+" Mark1: "+mark1+ " Mark2: "+mark2+" Total: "+total+" Average: "+average+ "Grade: "+grade+" Result:"+result);
    }
    
    public void calculateTotal(){
        this.total=this.mark1+this.mark2;
    }
    
    public void calculateAverage(){
        this.average=this.total/2;
    }
    
    public void result(){
        if(this.mark1>40&&this.mark2>=40){
            this.result="PASS";
        }
        else{
            this.result="FAIL";
        }
    }
    
   
    
    public void calculateGrade(){
        if(total>90){
            grade="A";
        }
        else if(total>=75&&total<90){
            grade="B";
        }
        else if(total>=60&&total<75){
            grade="C";
        }
        else if(total>40&&total<60){
            grade="D";
        }
        else{
            grade="C";
        }
    }
}
