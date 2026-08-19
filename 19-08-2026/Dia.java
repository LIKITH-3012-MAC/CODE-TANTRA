import java.util.*;
public class Dia{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
  System.out.println(" ENTER ROWS DIAGONAL.. ");
  int n=sc.nextInt();
  for (int i=0;i<n;i++){
  for(int j=0;j<n;j++){
    if(i==j){
     System.out.print(" A ");
   }
   else{
    System.out.print(" ");
 }
}
  System.out.println();
  }
 } 
}
