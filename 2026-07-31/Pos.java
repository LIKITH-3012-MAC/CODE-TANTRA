import java.util.*;

public class Pos{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println(" CHECK WHETHER ITS A POSITIVE OR NEGATIVE:..");
    System.out.println("ENTER A NUMBER..:");
    int num=sc.nextInt();
    
   if(num>0){
       System.out.println(" THE NUMBER IS POSITIVE ");
    }
   else if(num==0){
       System.out.println(" THE NUMBER IS EQUALS TO ZERO ");
    }
   else{
       System.out.println(" THE GIVEN NUMBER IS NEGATIVE NUMBER ");
     }
  }
}
