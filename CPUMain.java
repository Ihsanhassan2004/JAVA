import java.util.Scanner;
class CPU{
  double price;
    CPU(){
    }
   
   CPU(double p){
      price = p;
      }
  
  class Processor{
  int no_of_cores;
  String manufacturer;
  
  
  
    Processor(){
   }
   Processor(int n,String m){
      no_of_cores = n;
      manufacturer = m;
      }
  }
  static class RAM{
  int memory;
  String manufacturer;
  
  
   RAM(){
   }
   RAM(int n,String m){
      memory = n;
      manufacturer = m;
      }
  }}
  public class CPUMain{
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.print("cpu price:");
    double pr=input.nextDouble();
    CPU c1= new CPU(pr);
    input.nextLine();
    System.out.print("no of cors of processor:");
    int m=input.nextInt();
    input.nextLine();
    System.out.print("manufacture of processor:");
    String s=input.nextLine();
    CPU.Processor p= c1.new Processor(m,s);
    
    
    System.out.print("memory of RAM:");
    int m1=input.nextInt();
    input.nextLine();

    System.out.print("manufacture of RAM:");
    String s1=input.nextLine();
    CPU.RAM r = new CPU.RAM(m1,s1);
    
    System.out.println("---------------DETAILS OF CPU------------------------");
    System.out.println("CPU price: " + c1.price);
    System.out.println("No of cores of processor: " + p.no_of_cores);
    System.out.println("Processor manufacturer: " + p.manufacturer);
    System.out.println("RAM memory: " + r.memory);
    System.out.println("RAM manufacturer: " + r.manufacturer);
    }
}
