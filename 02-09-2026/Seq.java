class Seq{
 public static void main(String[] args){
   int arr[]={1,2,4,5,6};
  int p=1;
   for(int i=0;i<(arr.length);i++){
      if(arr[i]!=p){
           System.out.println(p);
         break; 
      }
     p++;   
     }
   }
}
