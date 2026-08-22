import java.util.*;

public class Butter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" ENTER ROWS..: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < 2 * (n - i - 1); j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < 2 * (n - i - 1); j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
