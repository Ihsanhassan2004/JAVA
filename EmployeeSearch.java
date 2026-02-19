  import java.util.Scanner;
import java.util.Arrays;
class Employee{
int eNo;
String eName;
double eSalary;

public Employee(int no,String name,double salary){
eNo = no;
eName = name;
eSalary = salary;
}
Employee(){
}
public void display(){
System.out.println("employee number: "+eNo);
System.out.println("employee name: "+eName);
System.out.println("employee salary: "+eSalary);
System.out.println("--------------------------------------------- ");
}
}
public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of employees (N): ");
        int n = input.nextInt();   
        Employee[] emp = new Employee[n];
        System.out.println("\n--- Enter Employee Details ---");
        for (int i = 0; i < n; i++) {
        System.out.println("Employee " + (i + 1) + ":");
        System.out.println("Enter employee No: ");
        int eNo = input.nextInt();
        input.nextLine();
        System.out.println("Enter employee Name: ");
        String eName = input.nextLine();
        System.out.println("Enter employee salary: ");
        double eSalary = input.nextDouble();
        emp[i]=new Employee(eNo,eName,eSalary);
        System.out.println();
}
System.out.println("Enter employee Number to search: ");
int searchId = input.nextInt();
System.out.println("\n----Search Results----- ");
boolean found = false;
for (int i = 0; i < n; i++){
if(emp[i].eNo == searchId){
System.out.println("\n Employee found");
emp[i].display();
found = true;
break;
}}
if (!found) {
    System.out.println("\nEmployee not found.");
}

}}
