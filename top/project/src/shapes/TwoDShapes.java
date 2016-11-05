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
public abstract class TwoDShapes extends shapes{
     final private int _numberOfSides;
    final private String _name;
    public TwoDShapes(String name, int numberOfSides){
        super(name,numberOfSides);
      this._name = name;
      this._numberOfSides = numberOfSides;
    
    }
    public abstract double getArea();
    public abstract double getPerimeter();
   
}

