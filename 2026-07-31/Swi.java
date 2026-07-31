import java.util.*;
class Swi{
 public static void main(String[] args){
 
  Scanner sc =new Scanner(System.in);
   System.out.println(" ENTER DAY NUMBER ");
    int day=sc.nextInt();

   switch(day){
case 1:
          System.out.println(" MONDAY MAVA ");
          break;
case 2:
          System.out.println(" TUESDAY MAVA ");
          break;
case 3:
          System.out.println(" WEDNESDAY MAVA ");
          break;
case 4:
          System.out.println(" THURSDAY MAVA ");
          break;
case 5:
          System.out.println(" FRIDAY MAVA ");
          break;
case 6:
          System.out.println(" SATURDAY MAVA ");
          break;
default: if(day<=7)
         System.out.println(" SUNDAY MAVA ");
         else
         System.out.println(" MAVA NUV CHEPPU ASSAL KI WEEK KI ENNI DAYS DAMN ENTI ASSALKI IDHI "+day+" DAY NA CHEPPU ");
      }
   }
}
