import java.util.*;
public class Count{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
  System.out.println(" ENTER A NUMBER..:");
  int n=sc.nextInt();
  int sum=0;
  int pro=1;
  int count=0;
  int ori=n;
  int rev=0;
  while(n!=0){
       int temp=n%10;
        sum+=temp;
        pro*=temp;
        rev=rev*10+temp;
        count++;
       n/=10;     
      
    }
   System.out.println(" THE SUM : "+sum+" THE PRODUCT: "+pro+" THE COUNT: "+ count);
   System.out.println(" THE NUMBER IS : "+(ori==rev ? " ITS A PALINDROME " : " ITS NOT A PALINDROME "));
   System.out.println(" THE REVERSE IS: "+ rev);
  }
}
