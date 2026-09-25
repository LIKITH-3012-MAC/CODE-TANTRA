class A {

    A() {
        System.out.println("A constructor");
    }
}

class B extends A {

    B() {
        this(10);
        System.out.println("B default");
    }

    B(int x) {
        System.out.println("B parameterized");
    }
    B(int y){ System.out.println("B parameterized");}
}

class Main1 {

    public static void main(String[] args) {

        new B();
    }
}
