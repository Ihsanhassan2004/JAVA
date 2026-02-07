import java.util.Scanner;
public class stringFun{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.print("ENTER A STRING:");
String s=input.nextLine();
System.out.println("a)creating a new string using new");
String s1=new String(s);
System.out.println("b)getting string length");
System.out.println("length of string: "+s1.length());
String s2= new String("ing");
System.out.println("c)String concatenation: "+s1+s2);
System.out.println("d)Charactrt extracction(charAt)");
System.out.println("3rd character of input string:  "+s.charAt(2));
System.out.println("e)String comparison(equal vs comapreTo)");
System.out.println("input string is equal to ('ing'):  "+s2.equals(s));
System.out.println("input string is compareTo to ('ing'):  "+s2.compareTo(s));
System.out.println("f)Searching substring(indexOf)");
String s3= new String("hello world");
System.out.println("index of world in the string('hello world') : "+s3.indexOf("world"));
System.out.println("g)Modifying string(replace/toUpperCase)");
System.out.println("replace 'world' into 'myfriend' : "+s3.replace("world","myfriend"));
System.out.println(" change world into uppercase:  "+("world").toUpperCase());
System.out.println("h)Data conversion using valueOf ");
int num = 100;
String numstring = String.valueOf(num);
System.out.println("Integer to String: " + numstring);
System.out.println("i)String spliting using split() ");
String s4= new String("hello world this is java programming");
String[] arr=s4.split(" ");
System.out.println("FIRST AND 3RD ELEMENT OF STRING: "+arr[0]+" , "+arr[2]);
System.out.println("j)Mutable string using StringBuffer");
StringBuffer sb= new StringBuffer("hello");
sb.append(" world");
System.out.println("Mutable string is: "+sb);
}}
