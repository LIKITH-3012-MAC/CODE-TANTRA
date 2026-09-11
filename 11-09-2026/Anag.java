import java.util.*;
public class Anag{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println(" ENTER WORD-1 ..: ");
   String s1=sc.nextLine();
   System.out.println(" ENTER WORD-2 ..: ");
   String s2=sc.nextLine();
   
   char c1[] = s1.toCharArray();
   char c2[] = s2.toCharArray();
   
   Arrays.sort(c1);
   Arrays.sort(c2);
   
   if(c1.length == c2.length){
      if(Arrays.equals(c1,c2)){
         System.out.println(" MAMA AH TWO WORDS ANAGRAM <good boy ");
      } else { 
         System.out.println(" MAMA LENGTH OK GAANI CHARACTERS VERU ");
      }
   } else {
      System.out.println("MAMA CORRECT LENGTH WORDS IVVU ");
   }
  }         
}
