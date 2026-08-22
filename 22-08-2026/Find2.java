import java.util.*;

class Find2{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println(" ENTER THE SIZE OF ARRAY ");
   int n=sc.nextInt();
   int[] arr=new int[n];

   System.out.println(" ENTER " + n + " ELEMENTS: ");
   for(int i=0; i<n; i++){
     arr[i] = sc.nextInt();
   }

   Arrays.sort(arr);
   System.out.println(" THE MAX : "+ arr[n-1] +" THE MIN : "+ arr[0]);
   }
}
