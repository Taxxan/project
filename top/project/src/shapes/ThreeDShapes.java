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
public abstract class ThreeDShapes extends shapes{
        final int _numberOfSides;
    final String _name;
    public ThreeDShapes(String name,int numberOfSides ){
       super(name, numberOfSides);
    _name = name;
    _numberOfSides = numberOfSides;
    
    }
    public abstract double getSArea();
    public abstract double getVolume();
   
}
