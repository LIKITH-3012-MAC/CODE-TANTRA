import java.util.*;
  public class Upp{
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" ENTER A LETTER TO CHECK ITS CASE... ");
    char c= sc.next().charAt(0);

    if(c >= 'a' && c <= 'z') {
    System.out.println(c + " is lowercase mava");
}
else if(c >= 'A' && c <= 'Z') {
    System.out.println(c + " IS  UPPERCASE MAVA");
}
else{
    System.out.println(" MAVA ADIGINDHI ALPHABETS LO IMMANI ,UNNECESSARY SYMBOLS "+c+" KAADHU ");
    }
  }
}
