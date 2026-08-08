import java.util.Scanner;

public class PowerOfReversedDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        int result = 1;

        for (int i = 0; i < rev; i++) {
            result = result * n;
        }

        System.out.println(result);

        sc.close();
    }
}
