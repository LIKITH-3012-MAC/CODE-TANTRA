import java.util.*;
public class PalStr{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println(" ENTER A WORD TO CHECK IT PALINDROME OR NOT.. ");
   String s=sc.nextLine();
   String rev="";
   for(int i=s.length()-1;i>=0;i--){
    rev+=s.charAt(i);
    }
 System.out.println(s.equals(rev)? " ITS A PALINDROME BROOOO " : " ITS NOT A PALINDROME BRO");
  }
}
