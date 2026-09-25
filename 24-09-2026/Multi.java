class Animal{
 void ani(){
  System.out.println(" HI IM CHIMPAnJI ");
}
}

class Human extends Animal{
 void hum(){
 System.out.println(" HI WE'RE EVOLUTED FROM CHIMPANJEE ");
 }
}

class Likith extends Human{
void lik(){
 System.out.println(" AND FINALLY IM LIKITH GEN-z ");
 }
}

public class Multi{
  public static void main(String[] args){
   Likith l=new Likith();
  l.ani();
  l.hum();
  l.lik();
 }
}
