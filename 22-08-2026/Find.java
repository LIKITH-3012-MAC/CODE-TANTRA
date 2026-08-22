import java.util.*;
public class Find{

  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println(" ENTER THE SIZE OF ARRAY ");
   int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println(" ENTER "+n+" ELEMENTS INTO ARRAY..");
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }
   int max=0;
   int min=0;
  for(int i=0;i<n;i++){
    if(arr[i]>max){
       max=arr[i];
      }
    if(arr[i]<min){
     min=arr[i];
     }
    }
   System.out.println("THE MAX "+max+ " THE MIN "+min);

  }
}

