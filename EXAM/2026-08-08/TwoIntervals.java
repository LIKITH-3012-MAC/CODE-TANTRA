import java.util.Scanner;

public class TwoIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter l1, r1, l2, r2: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int start = Math.max(l1, l2);
        int end = Math.min(r1, r2);

        if (start <= end) {
            System.out.println("Intersection: " + start + " " + end);
        } else {
            System.out.println("-1");
        }

        sc.close();
    }
}
