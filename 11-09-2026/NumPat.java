import java.util.*;
public class NumPat{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    System.out.println(" ENTER NO.OF ROWS..");
    int n=sc.nextInt();
    int a=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print((++a) + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
