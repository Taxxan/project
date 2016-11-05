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
public class Rectangle extends TwoDShapes {
    
    private final double height;
    private final double width;
    
    public Rectangle(String name, double height,double width ){
    super(name, 4);
    this.height = height;
    this.width = width;
    
}
    @Override       
    public double getArea(){
        
        return height * width;
    
}
@Override       
    public double getPerimeter(){
        
        return 2 * (height+width);
    
}
    @Override
    public void displayD(){
        
        System.out.println("My area is "+ getArea());
        System.out.println("My perimetter is "+ getPerimeter());
    }

}
