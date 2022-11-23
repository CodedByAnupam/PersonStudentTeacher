/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anupam_pathak
 */
public class Teacher extends Person{
    private int sal;
    
    public Teacher(String name,String add,int sal){
        super(name,add);
        this.sal = sal;
    }
    
    public String toString(){
        return super.toString() + "\n  salary " + this.sal + " euro/month";
    }
}
