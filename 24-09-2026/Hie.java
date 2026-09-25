class Sup{
   void hi(){
    System.out.println(" HI IM SUP class -1 ");
   }
}

class Sem extends Sup{
void hi1(){
   System.out.println(" HI SUP CLASS TWO ");
 } 
}

class Sub extends Sup{
  void hi2(){
    System.out.println(" hi im Sub ");
  }
}

public class Hie{
 public static void main(String[] args){
     Sub s=new Sub();
     Sem s1=new Sem();
     s.hi();
     s1.hi1();
     s.hi2();
  }
}
