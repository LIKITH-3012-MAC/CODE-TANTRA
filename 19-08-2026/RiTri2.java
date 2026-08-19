import java.util.*;

class RiTri2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**** THE TRIANGLE RIGHT ANGLE ****");
        System.out.println("ENTER ROWS:");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
           for(int j=i;j<n;j++){
            System.out.print("* ");
          }
            System.out.println();
        }
    }
}
