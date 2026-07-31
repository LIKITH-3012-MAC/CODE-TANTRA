import java.util.*;
class Tra{
   public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   System.out.println(" MAVA NEE MUNDHU UNNA SIGNAL COLOR CHEPPU , NUV PROCEED AVVALO LEDHO CHEPTHA .Ok na! "); 
   String sig=sc.next().toLowerCase();
    
   switch(sig){
        case "red":
           System.out.println(" MAVA AAGU KONCHAM SEPU ");
         break;
         case "green":
           System.out.println(" MAVA VELLI AAGAKU ,Quick ");
         break;
         case "yellow":
            System.out.println(" MAVA VELLU KAANI CHUUSKONI VELLU JAGARTHA ");
         break;
         default:
          System.out.println(" MAVA KOTTHA COLOURS IVVAKU POLICE LU KODUTHARU ");
     }
   }
}
