import java.util.*;

public class SynSumProAvgRev {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TYPE 1: Dynamic Array
        System.out.println("ENTER ARRAY SIZE:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("ENTER " + size + " ELEMENTS:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        // TYPE 2: Direct Initialization
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};


        // TYPE 3: Declaration + Allocation + Assignment
        int[] arr2;

        arr2 = new int[2];

        arr2[0] = 100;
        arr2[1] = 200;


        // Operations on dynamic array
        int su = 0;
        int pro = 1;

        for (int i = 0; i < size; i++) {
            su += arr[i];
            pro *= arr[i];
        }

        System.out.println("SUM = " + su);
        System.out.println("PRODUCT = " + pro);
        System.out.println("AVERAGE = " + (double) su / size);

        System.out.println("REVERSED ARRAY:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
