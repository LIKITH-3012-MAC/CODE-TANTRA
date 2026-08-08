import java.util.Scanner;

public class GenerateAKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int key = 0;

        for (int i = 1000; i >= 1; i /= 10) {
            int d1 = (n1 / i) % 10;
            int d2 = (n2 / i) % 10;
            int d3 = (n3 / i) % 10;

            int min = Math.min(d1, Math.min(d2, d3));
            key = key * 10 + min;
        }

        System.out.println(key);

        sc.close();
    }
}
