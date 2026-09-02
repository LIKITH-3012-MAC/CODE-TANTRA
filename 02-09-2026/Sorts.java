import java.util.*;
class Sorts{
 public static void main(String[] args){
   int arr[] = {1,5,4,2,1,3,8,9,10};
   int n = arr.length;
   boolean isSorted = true;
   for(int i = 0; i < n-1; i++){
     if(arr[i] > arr[i+1]){
       isSorted = false;
       break;
     }
   }
   if(isSorted){
     System.out.println("THE ARRAY IS SORTED");
   } else {
     System.out.println("THE ARRAY IS NOT A SORTED ARRAY");
   }
 }
}
