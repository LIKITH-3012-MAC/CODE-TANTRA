import java.util.*;
 public class PerfectFact{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println(" -------- PERFECT AND FACTORIAL -------- ");
   System.out.println(" ENTER A NUMBER ...: ");    
int n=sc.nextInt();
     int sum=0;
    int f=1;
    for (int i=1;i<=n;i++){
         if(n%i==0){
            sum+=i;
          }
          f*=i;
          
      }
     int sums=sum-n;
    System.out.println(" THE FACTORIAL IS : "+f);
    System.out.println(" THE NUMBER IS ..: " +n+ " - "+(n==(sums)? " PERFECT " : " NOT A PERFECT  ")); 
   }
}
