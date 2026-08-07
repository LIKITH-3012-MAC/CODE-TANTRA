import java.util.*;

public class Strong{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   System.out.println(" ------- THE STRONG NUMBER CHECKER ------- ");
    System.out.println(" ENTER A NUMBER ..: ");
   int n=sc.nextInt();
    int sum=0;
    int ori=n; 
  while(n>0){
    int f=1;
    int tem=n%10;
    for ( int i=1;i<=tem;i++){
           f*=i;
   }
   sum+=f;
   n/=10;
  }
 
  System.out.println((sum==ori)?" STRONG":" NOT STRONG "); 
 }
} 
