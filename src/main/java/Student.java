/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anupam_pathak
 */
public class Student extends Person{
    private int credit;
    
    public Student(String name,String add){
        super(name,add);
        this.credit = 0;
    }
    
    public int credits(){
//        Study credits 0
//        System.out.println("Study credits " + this.credit);
        return this.credit;
    }
    
    public void study(){
        this.credit++;
    }
    
    public String toString(){
        return super.toString() + "\n  Study credits " + this.credit;
    }
    
}
