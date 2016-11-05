/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Student
 */
public abstract class shapes {
  
   final private int noOfSides;
    final private String name;
    public int getNoOfSides(){
        return noOfSides;
    }
    public String getName(){
        return name;
    }
    public shapes(String name, int noOfSides){
        this.name = name;
        this.noOfSides = noOfSides;
    }
    
    public void displayD(){
        System.out.println("My name is "+name);
    }
}
