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
public class Sphere extends ThreeDShapes{
    private final double radius;
    
    public Sphere(String name, double radius){
    super(name, 0);
    this.radius = radius;
}
    @Override       
    public double getSArea(){
        
        return 4*Math.PI*Math.pow(radius, 2);
    
}
@Override       
    public double getVolume(){
        
        return 4/3*(Math.PI*Math.pow(radius, 2));
    
}
   
    @Override
    public void displayD(){
        
        System.out.println("My area is "+ getSArea());
        System.out.println("My perimetter is "+ getVolume());
    }
}
