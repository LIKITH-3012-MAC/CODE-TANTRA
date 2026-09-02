import java.util.*;
class Dup {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 1, 2, 5, 4, 6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if ((i==0 || (arr[i] != arr[i - 1])) &&
                (i==arr.length-1||arr[i]!=arr[i+1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
