/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.Scanner;

/**
 *
 * @author Taxan
 */
public class Test {
public static void main(String[] args){
int yop;
Scanner scanner = new Scanner(System.in);


    
    System.out.println("what do you want? \n 1.rectangle \n 2. circle \n 3.cylinder \n 4.sphere \n 5.triangle");
    int num = scanner.nextInt();
    if (num == 1){
        System.out.println("enter the name");
String name = scanner.nextLine();
        System.out.println("gimme the length");
double length = scanner.nextInt();
System.out.println("gimme the width");
double width = scanner.nextInt();
        Rectangle rekt = new Rectangle(name,length,width);
rekt.displayD();
    }
    else if (num==2){
        System.out.println("enter the name");
String name = scanner.nextLine();
    System.out.println("gimme the radius");
double radius = scanner.nextInt();

    Circle o = new Circle(name,radius);
    o.displayD();
}
 if (num == 3){
     System.out.println("enter the name");
String name = scanner.nextLine();
        System.out.println("gimme the radius");
double radius = scanner.nextInt();
System.out.println("gimme the height");
double height = scanner.nextInt();
        Cylinder cyl = new Cylinder(name,radius,height);
cyl.displayD();
    }
 if (num == 4){
System.out.println("enter the name");
String name = scanner.nextLine();
System.out.println("gimme the radius");
double radius = scanner.nextInt();

        Sphere pho = new Sphere(name,radius);
pho.displayD();
    }
  if (num == 5){
      System.out.println("enter the name");
String name = scanner.nextLine();
        System.out.println("gimme the base");
double base = scanner.nextInt();
System.out.println("gimme the height");
double height = scanner.nextInt();
System.out.println("gimme the sideA");
double sideA = scanner.nextInt();
System.out.println("gimme the sideB");
double sideB = scanner.nextInt();
        Triangle illum = new Triangle(name,base,height,sideA,sideB);
illum.displayD();
    }
    }
}
