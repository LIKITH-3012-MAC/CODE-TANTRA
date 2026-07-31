import java.util.*;
class De1{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("******* THE ELECTION COMMISSION VOTE (ELEGIBLE CHECKER) *******");
   System.out.println(" ENTER YOUR AGE : ");
   int age=sc.nextInt();
   if(age>=18){
      System.out.println(" ELEGIBLE..");
   }
   else{
     System.out.println("  NOT ELEGIBLE  ");
    }
  }
}
