import java.util.*;
 public class Pali{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println(" ENTER NUMBER : ");
   int ori = sc.nextInt();
   int rev=0;
   int n=ori;
   while (n>0){
       int e=n%10;
       rev=rev*10+e;
       n/=10;
    }
   System.out.println(" THE NUMBER IS :"+(rev==ori? " PALINDROME " : " NOT PALINDROME "));
   sc.close();
  }
}
