import java.util.*;
public class ToSort{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
   System.out.println(" ENTER A STRING TO SORT BROO ");
   String s=sc.nextLine();
   char c[]=s.toCharArray();
   for(int i=0;i<c.length;i++){
     for(int j=i+1;j<c.length;j++){
           if(c[i]>c[j]){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
           }
     }
   }
   for(int k=0;k<c.length;k++){
       System.out.print(c[k]+"");
   }
   sc.close();
 }
}
