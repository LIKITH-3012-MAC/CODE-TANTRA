import java.util.*;
class De{
  public static void main(String[] args){
    System.out.println("ENTER NUMBER:");
    Scanner sc=new Scanner(System.in);
 
    int n=sc.nextInt();
    String result;
 
    if (n%2==0 || n%2!=0){

        result=(n%2==0)?" Even ":" ODD ";

        System.out.println(result);
    }
  }
}
