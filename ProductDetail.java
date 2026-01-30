import java.util.Scanner;
class Product{
   int pcode;
   String pname;
   double price;
   
   Product(){
   }
   Product(int c,String n,double p){
      pcode = c;
      pname = n;
      price = p;
      }
      void display(){
        System.out.println(pcode+"\t"+pname+"\t"+price);
    }
  }    

public class ProductDetail{
 public static void main(String[] args){
     Scanner input= new Scanner(System.in);
     Product p1=new Product(101,"Laptop",4500.00);
     System.out.println("............Enter details for product2...........");
     System.out.println(" product code:");
     int c2=input.nextInt();
     input.nextLine();
     System.out.print("PRODUCT NAME:");
     String n2=input.nextLine();
     System.out.print("Price:");
     double pr2=input.nextDouble();
     Product p2=new Product(c2,n2,pr2);
     System.out.println("............Enter details for product3......");
     Product p3=new Product();
     System.out.print("product code:");
     p3.pcode=input.nextInt();
     input.nextLine();
     System.out.print("PRODUCT NAME:");
     p3.pname=input.nextLine();
     System.out.print("Price:");
     p3.price=input.nextDouble();
     System.out.println("\n......Product with lowest price......");
     Product low=p1;
     if (p2.price<low.price){
        low=p2;
      }
     if (p3.price<low.price){
      low=p3;
     }
     System.out.println("code \t name \t price");
     low.display();
    }
    }
