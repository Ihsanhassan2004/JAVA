import java.util.Scanner;
public class Matrix{
   public static void main(String[] args){
   Scanner input= new Scanner(System.in);
   System.out.println("----------------enter diamensions for matrix A--------------------");
   System.out.println("enter rows:");
   int r1=input.nextInt();
   System.out.println("enter cols:");
   int c1=input.nextInt();
   System.out.println("-----------------enter diamensions for matrix B----------------------------");
   System.out.println("enter rows:");
   int r2=input.nextInt();
   System.out.println("enter cols:");
   int c2=input.nextInt();
   int[][] A=new int[r1][c1];
   int[][] B=new int[r2][c2];
  
   
   System.out.println("enter elements for MATRIX A:");
   for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
         A[i][j]=input.nextInt();
      }
   }
   System.out.println("enter elements for MATRIX B:");
   for(int i=0;i<r2;i++){
      for(int j=0;j<c2;j++){
         B[i][j]=input.nextInt();
      }
   }
while(true){
  System.out.println("\n----MENU--- \n1.Addition\n2.Multiplication\n3.Exit\n");
  System.out.println("ENTER YOUR CHOICE:");
  int choice = input.nextInt();
  if(choice == 3) break;
  switch(choice){
    case 1:
      if(r1==r2 && c1==c2){
       int[][] C=new int[r1][c1];
        System.out.println("SUM of Matrix:");
         for(int i=0;i<r1;i++){
          for(int j=0;j<c2;j++){  
           C[i][j] = A[i][j] + B[i][j];
            System.out.print(C[i][j]+"\t");
            }
            System.out.println();
             }
             } else {
               System.out.println("Addition not possible (dimension mismatch).");
              }
              break;
     case 2:
        if (c1 == r2) {
        int[][] C = new int[r1][c2];

         System.out.println("PRODUCT of Matrix:");
           for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
             C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                  C[i][j] += A[i][k] * B[k][j];
                    }
               System.out.print(C[i][j]+"\t");
               }
            System.out.println();
               }
              } else {
              System.out.println("Multiplication not possible (dimension mismatch).");
               }
                break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}





       
                  
   
   
