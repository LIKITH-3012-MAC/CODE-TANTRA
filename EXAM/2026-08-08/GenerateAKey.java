import java.util.Scanner;

public class GenerateAKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1, num2, num3: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int key = 0;

        for (int i = 1000; i >= 1; i /= 10) {
            int d1 = (num1 / i) % 10;
            int d2 = (num2 / i) % 10;
            int d3 = (num3 / i) % 10;

            int min = Math.min(d1, Math.min(d2, d3));
            key = key * 10 + min;
        }

        System.out.println("Key: " + key);

        sc.close();
    }
}
