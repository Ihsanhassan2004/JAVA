import java.util.Scanner;
interface Shape{
double area();
double perimeter();
}
class circle implements Shape{
private double radius;
public  circle(double radius){
this.radius=Math.abs(radius);
}
public double area(){
 return Math.PI*radius*radius;
}
public double perimeter(){
 return 2*Math.PI*radius;
}
}
class Rectangle implements Shape{
private double length;
private double breadth;
public  Rectangle(double length,double breadth){
this.length=Math.abs(length);
this.breadth=Math.abs(breadth);
}
public double area(){
 return length*breadth;
}
public double perimeter(){
 return 2*(length+breadth);
}
}
public class InterfaceDemo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Shape currentshape=null;
while(true){
System.out.println("\n---Shape Calculator---");
System.out.println("1.circle");
System.out.println("2.rectangle");
System.out.println("3.exit");
System.out.println("select an option:");
int choice = sc.nextInt();
if(choice==3){
System.out.println("Execution terminated");
break;
}
switch(choice){
case 1:
   System.out.println("Enter radius:");
   double r=sc.nextDouble();
   currentshape=new circle(r);
   break;
case 2:
   System.out.println("Enter length and breadth:");
   double l=sc.nextDouble();
   double b=sc.nextDouble();
   currentshape=new Rectangle(l,b);
   break;
default:
   System.out.println("error,select another option");
   continue;
   }
   System.out.println("Area   "+currentshape.area());
   System.out.println("Perimeter "+currentshape.perimeter());
   }
 }
 }
   
   
   

