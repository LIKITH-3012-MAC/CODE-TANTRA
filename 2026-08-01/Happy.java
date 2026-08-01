import java.util.*;
public class Happy{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println(" ENTER YOU VALUE :");
    int n=sc.nextInt();
    int original = n;

    while(n!=1 && n!=4){
       int sum=0;
       while(n>0){
           int temp=n%10;
           sum += temp*temp;
           n/=10;
       }
       n=sum;
    }   
    System.out.println(" THE NUMBER: "+original+ "  IS A "+(n==1?" HAPPY ": " NOT A HAPPY "));

  }
}
