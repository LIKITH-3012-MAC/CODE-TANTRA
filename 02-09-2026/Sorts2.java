import java.util.*;

class Sorts2 {

    public static void main(String[] args) {

        int arr[] = {1, 23, 4, 2, 1, 3, 8, 90, 10};

        int n = arr.length;
        int l = 0;

        if (arr[l] > arr[l + 1] ||
            arr[n - 1] < arr[n - 2] ||
            arr[(n / 2) - 1] < arr[(n / 2) - 2]) {

            System.out.println("THE ARRAY IS NOT A SORTED ARRAY");

        } else {

            System.out.println("THE ARRAY IS SORTED");

        }
    }
}
