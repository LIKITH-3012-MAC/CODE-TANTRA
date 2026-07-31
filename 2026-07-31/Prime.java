import java.util.*;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER START RANGE : ");
        int start = sc.nextInt();
        System.out.println(" ENTER END RANGE : ");
        int end = sc.nextInt();
        
        System.out.print(" PRIME NUMBERS : ");
        
        for(int num = start; num <= end; num++){ 
            if(num < 2) continue; 
            int count = 0;
            
            for(int i = 1; i <= num; i++){ 
                if(num % i == 0){
                    count++;
                }
            }
            
            if(count == 2){ 
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
