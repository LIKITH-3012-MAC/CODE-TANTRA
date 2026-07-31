import java.util.*;
 public class Even{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println(" ENTER THE RANGE YOU WANNA CHECK EVEN AND ODD ");
    int n=sc.nextInt();
    for(int i = 0;i<=n;i++){
     System.out.println("THE NUMBER IS: "+(i%2==0 ? "EVEN "+i: "ODD "+i));
    }
  }
}
