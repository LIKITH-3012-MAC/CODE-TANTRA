import java.util.*;

public class Merge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF ARRAY...: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int m = n * 2;
        int[] mer = new int[m];

        System.out.println("ENTER " + n + " ELEMENTS INTO ARR 1..");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("ENTER " + n + " ELEMENTS INTO ARR 2..");

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int p = 0;

        for (int i = 0; i < n; i++) {
            mer[p] = arr1[i];
            p++;
        }

        for (int i = 0; i < n; i++) {
            mer[p] = arr2[i];
            p++;
        }

        System.out.println("AFTER MERGING TWO ARRAYS:");

        for (int i = 0; i < m; i++) {
            System.out.print(mer[i] + " ");
        }
    }
}
