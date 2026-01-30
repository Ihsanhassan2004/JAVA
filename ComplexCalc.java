import java.util.Scanner;
class Complex{
double real;
double image;

Complex(){
}
Complex(double r,double i){
real=r;
image=i;
}
Complex add(Complex c2){
  Complex result=new Complex();
  result.real=real+c2.real;
  result.image=image+c2.image;
  return result;

}
Complex sub(Complex c2){
  Complex result=new Complex();
  result.real=real-c2.real;
  result.image=image-c2.image;
  return result;
}
Complex mul(Complex c2){
  Complex result=new Complex();
  result.real=(real*c2.real)-(image*c2.image);
  result.image=(real*c2.image)-(image*c2.real);
  return result;
}
void display(){
System.out.println(real+" + "+image+"i");
}
}
public class ComplexCalc{
 public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 System.out.println("enter real and imaginary part of first number:");
 double r1=input.nextDouble();
 double i1=input.nextDouble();
 Complex c1=new Complex(r1,i1);
 System.out.println("enter real and imaginary part of second number:");
 double r2=input.nextDouble();
 double i2=input.nextDouble();
 Complex c2=new Complex(r2,i2);
 System.out.println("\n--------------------------result-----------------------");
 Complex sum=c1.add(c2);
 Complex sub=c1.sub(c2);
 Complex mul=c1.mul(c2);
 System.out.print("sum    :");
 sum.display();
 System.out.print("difference    :");
 sub.display();
 System.out.print("product    :");
 mul.display();
 
}} 
 
 
 
