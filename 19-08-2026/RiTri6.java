import java.util.*;
public class RiTri6{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println(" UPWARD TRI ");
   System.out.println(" ENTER ROWS..: ");
   int n=sc.nextInt();
   for(int i=0;i<n;i++){
   for (int j=i;j<i;j++){
     System.out.println(" ");
  }
   for(int j=0;j<=2*i-1;j++){
      System.out.print(" *");   
}
System.out.println();
   }  
 } 
}
