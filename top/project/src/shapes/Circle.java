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
public class Circle extends TwoDShapes {
    private final double radius;
    
    
public Circle(String name, double radius){
    super(name, 0);
    this.radius=radius;
}
    @Override       
    public double getArea(){
        
        return Math.PI*Math.pow(radius, 2);
    
}
@Override       
    public double getPerimeter(){
        
        return 2*Math.PI*radius;
    
}
     @Override
    public void displayD(){
        
        System.out.println("My area is "+ getArea());
        System.out.println("My perimetter is "+ getPerimeter());
    }
}
