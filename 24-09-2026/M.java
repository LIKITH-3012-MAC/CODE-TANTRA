class A {

    A(int x) {
        System.out.println(x);
    }
}

class B extends A {

    B(int x) {
        System.out.println("B");
      super(x);
    }
}


class M{public static void main(String[] args){ B b=new B(10);}}
