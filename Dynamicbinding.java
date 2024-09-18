Q)Design a base class shape with two double type values and member functions to input the data 
and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. 
Make compute_area() as abstract function and redefine this function in the derived class to suit 
their requirements. Write a program that accepts dimensions of triangle/rectangle and display 
calculated area. Implement dynamic binding for given case study.


package shapes;
import java.util.*;

abstract class Area{
	double base,height;
	double length,breadth;
	double radius;
	abstract void getdata();
	abstract double CalculateArea();
	
	
}
class triangle extends Area{
	void getdata() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the value of base of a triangle");
	base=sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter the value of height of a triangle ");
	height=sc.nextDouble();
	sc.nextLine();
   }
	public double CalculateArea() {
		return 0.5*height*base;
}
}
class rectangle extends Area{
	void getdata() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the value of length of a rectangle");
	length=sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter the value of breadth of a reactangle  ");
	breadth=sc.nextDouble();
	sc.nextLine();
   }
	public double CalculateArea() {
		return length*breadth;
}
}
class Circle extends Area{
	void getdata() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter value of radius of the circle");
	radius=sc.nextDouble();
	sc.nextLine();
   }
	public double CalculateArea() {
		return 3.14*radius*radius;
}
}
class Sphere extends Area{
	void getdata() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter value of radius of the Sphere");
	radius=sc.nextDouble();
	sc.nextLine();
   }
	public double CalculateArea() {
		return 4*3.14*radius*radius;
}
}

public class shapes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          Area a1=new triangle();
          Area a2=new rectangle();
          Area a3 =new Circle();
          Area a4=new Sphere();
          while(true) {
        	  System.out.println("enter value to calculate area of:");
        	  System.out.println("1.Triangle");
        	  System.out.println("2.Rectangle");
        	  System.out.println("3.Circle");
        	  System.out.println("4.Sphere");
        	  int choice=sc.nextInt();
        	  switch(choice) {
        	  case 1 :a1.getdata();
              System.out.println("The area of triangle is"+a1.CalculateArea());
              break;
        	  case 2 :a2.getdata();
              System.out.println("The area of rectangle is"+a2.CalculateArea());
              break;
        	  case 3 :a3.getdata();
              System.out.println("The area of Circle is"+a3.CalculateArea());
              break;
        	  case 4 :a4.getdata();
              System.out.println("The area of Sphere is"+a4.CalculateArea());
              break;
        	 
        	  }
          }
        

	}

}
