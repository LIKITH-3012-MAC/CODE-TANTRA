import java.util.*;
 public class Pali2{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println(" ENTER NUMBER : ");
   int ori = sc.nextInt();
   int rev=0;
   int n=ori;
   if (n>9){
   do{
       int e=n%10;
       rev=rev*10+e;
       n/=10;
    }while (n>0);
   System.out.println(" THE NUMBER IS :"+(rev==ori? " PALINDROME " : " NOT PALINDROME "));
    }
else{
  System.out.println(" MAVA Two digits lo ivvu");
     }
   sc.close();
  }
}


