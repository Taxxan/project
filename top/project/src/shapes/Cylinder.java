/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Taxan
 */
public class Cylinder extends ThreeDShapes{
   final double radius;
    final double height;
    
    public Cylinder(String name, double radius, double height){
    super(name, 0);
    this.radius = radius;
    this.height=height;
    
}
    @Override       
    public double getSArea(){
        
        return 2*Math.PI*radius*(radius+height);
    
}
@Override       
    public double getVolume(){
        
        return height*(Math.PI*Math.pow(radius, 2));
    
}
     @Override
    public void displayD(){
        
        System.out.println("My area is "+ getSArea());
        System.out.println("My perimetter is "+ getVolume());
    }
}
