import java.util.*;
  public class Spy{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println(" ENTER A NUMBER: ");
    int n =sc.nextInt();
    int prod=1;
int or=n;
    int sum=0;
    while(n>0){
     int temp=n%10;
      prod*=temp;
      sum+=temp;
    n/=10;
     }
    System.out.println(" THE NUMBER " + or + " IS A "+( sum== prod ? " ITS A SPY " : " NOT A SPY "));
   }
}
