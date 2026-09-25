import java.util.*;
class Dup{
  public static void main(String[] args){
     int count=0;
     Scanner sc=new Scanner(System.in);
     int[] a=new int[]{1,2,1,3,42,2,9};
     boolean[] visited=new boolean[a.length];
     for(int i=0;i<a.length;i++){
     count=0;
     if(visited[i]) continue;
        for(int j=i+1;j<a.length;j++){
            if(a[i]==a[j]){
             count++;
            visited[j]=true;
            }
         }
      System.out.println(a[i]+" : "+count);
    if(count==1){
     System.out.println(a[i]+"");
        }
      }
   }
}
