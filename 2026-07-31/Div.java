import java.util.*;
public class Div {
    public static void main(String[] args){
        System.out.println("Enter numbers to divide:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
}
