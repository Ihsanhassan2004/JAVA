import java.util.Scanner;
import mathutils.Calculator;
public class PackageDemo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Calculator calc = new Calculator();
System.out.println("enter first number: ");
int num1=sc.nextInt();
System.out.println("enter second number: ");
int num2=sc.nextInt();
System.out.println("-------RESULTS------");
System.out.println("addition :"+calc.add(num1,num2));
System.out.println("subtraction :"+calc.sub(num1,num2));
System.out.println("multiplication "+calc.mul(num1,num2));
System.out.println("division "+calc.div(num1,num2));
}
}
