import java.util.*;
public class Year{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println(" ENTER THE YEAR ");
    int y=sc.nextInt();
    
    if((y%400==0) || y%4==0 && y%100!=0){
        System.out.println(" THE YEAR IS LEAP");
      }
     else{
        System.out.println(" not a leap ");
      }
   }
}
