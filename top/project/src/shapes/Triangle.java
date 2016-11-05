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
public class Triangle extends TwoDShapes{
    final double base;
    final double height;
    final double sideA;
    final double sideB;
    public Triangle(String name, double base, double height,double sideA,double sideB){
    super(name,3);
    this.base=base;
    this.height=height;
    this.sideA=sideA;
            this.sideB=sideB;
    }
    @Override
    public double getPerimeter(){
    return sideA+sideB+base;
    }
    @Override
    public double getArea(){
    return 0.5*height*base;
    }
     @Override
    public void displayD(){
        
        System.out.println("My area is "+ getArea());
        System.out.println("My perimetter is "+ getPerimeter());
    }
}
