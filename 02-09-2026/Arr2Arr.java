import java.util.*;
class Arr2Arr{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
   System.out.println("ENTER THE SIZE OF ARRAY..");
   int n=sc.nextInt();
   int[] arr=new int[n];
    System.out.println(" ENTER "+n+" ELEMENT INTO ARRAY>>");
     for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
     }
   int[] nea=new int[n];
    System.out.println(" TRANSFERING ONE ARRAY TO ANOTHER ");
   for(int i=0;i<n;i++){
       nea[i]=arr[i];
     }
   for (int i=0;i<n;i++){
     System.out.print(nea[i]+" ");
      }
   }
}
