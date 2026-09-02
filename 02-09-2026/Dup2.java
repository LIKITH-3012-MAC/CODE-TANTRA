o
import java.util.*;
class Dup2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ENTER THE SIZE OF ARRAY....: ");
         
         int n=sc.nextInt();
          int[] arr=new int[n];       
System.out.println(" ENTER "+n+" ELEMENTS INTO ARRAY..");  
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
 }
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("Non Duplicate: " + arr[i]);
            }
        }
    }
}

