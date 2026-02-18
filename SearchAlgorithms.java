import java.util.Scanner;
import java.util.Arrays;
public class SearchAlgorithms{
static int linearSearch(int[] arr,int target){
for (int i=0;i<arr.length;i++){
if(arr[i]==target){
return i;
}
}
return -1;
}
static int binarySearchSimple(int[] arr,int target){
int low=0;
int high=arr.length - 1;
while(low <= high){
int mid =(low+high)/2;
if(arr[mid]==target){
return mid;
}
else if(arr[mid] < target){
low=mid+1;
}
else{
high=mid-1;
}
}
return -1;
}
static int binarySearchRecursive(int[] arr,int target,int low,int high){
if (low > high){
return -1;
}
int mid = (low + high)/2;
if(arr[mid]==target){
return mid;
}
else if(arr[mid] < target){
return binarySearchRecursive(arr,target,mid+1,high);
}
else{
return binarySearchRecursive(arr,target,low,mid-1);
}}




public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Enter number of elements:");
int n=input.nextInt();
int[] arr= new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<n;i++){
arr[i]=input.nextInt();
}
System.out.println("Enter the element to search:");
int target = input.nextInt();
System.out.println("\n---Linear SearchResult---");
int lResult=linearSearch(arr,target);
if(lResult != -1){
System.out.println("ELEMENT FOUND AT INDEX : "+lResult);
}
else{
System.out.println("ELEMENT NOT FOUND!!!!!!");
}
Arrays.sort(arr);
System.out.println("\n(Array has been sort for Binary Search)");
System.out.println("Sorted Array:"+Arrays.toString(arr));
System.out.println("\n----Simple Binary Search Result---");
int bResult=binarySearchSimple(arr,target);
if(bResult != -1){
System.out.println("ELEMENT FOUND AT INDEX : "+bResult);
}
else{
System.out.println("ELEMENT NOT FOUND!!!!!!");
}
System.out.println("\n----Recursive Binary Search Result---");
int rResult=binarySearchRecursive(arr,target,0,n-1);
if(rResult != -1){
System.out.println("ELEMENT FOUND AT INDEX : "+rResult);
}
else{
System.out.println("ELEMENT NOT FOUND!!!!!!");
}}}

