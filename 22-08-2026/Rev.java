public class Rev{

public static void main(String[] args){
   int arr[]={1,2,3,4,5,6,7,8,9};
   int p=0;
   int[] ar1=new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
      ar1[p]=arr[i];
      p++;
    }
   for(int i=0;i<ar1.length-1;i++){
     System.out.println(ar1[i]);
    }
  }
}
