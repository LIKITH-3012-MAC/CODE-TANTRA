import java.util.*;

class RiTri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**** THE TRIANGLE RIGHT ANGLE ****");
        System.out.println("ENTER ROWS:");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("JAVA ");
            }

            System.out.println();
        }
    }
}
