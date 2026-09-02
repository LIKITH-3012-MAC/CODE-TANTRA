import java.util.*;

class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF ARRAY..");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("ENTER " + n + " ELEMENTS INTO ARRAY");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] odd = new int[n];
        int[] even = new int[n];
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evenCount] = arr[i];
                evenCount++;
            } else {
                odd[oddCount] = arr[i];
                oddCount++;
            }
       }
        System.out.println("THE EVEN ELEMENTS ARE...");
        for (int i = 0; i < evenCount; i++) {
            System.out.println(even[i]);
        }
        System.out.println("THE ODD ELEMENTS ARE...");
        for (int i = 0; i < oddCount; i++) {
            System.out.println(odd[i]);
        }

        sc.close();
    }
}
