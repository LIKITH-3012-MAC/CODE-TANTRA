final class Fi1 {

    void inh() {
        System.out.println("YOU CAN'T INHERIT ME");
    }
}

class Fi {

    final void method() {
        System.out.println("HI I'M FINAL METHOD");
    }

    void sample() {
        System.out.println("HI I'M SAMPLE METHOD");
    }
}

public class Fin {

    final int i = 10;

    public static void main(String[] args) {

        System.out.println("HI I'M FINAL PROJECT");

        Fin fin = new Fin();

        System.out.println(
            "HI I'M FINAL VARIABLE " + fin.i +
            " I'M IMMUTABLE ONCE ASSIGNED"
        );

        Fi f = new Fi();

        f.sample();
        f.method();

        try {
            Fi1 f1 = new Fi1();

            f1.inh();

            if (java.lang.reflect.Modifier.isFinal(Fi1.class.getModifiers())) {
                throw new Exception("YOU CANNOT INHERIT FINAL CLASS");
            }

        } catch (Exception e) {
            System.out.println(
                "MAMA YOU CANNOT INHERIT FINAL CLASS: " + e.getMessage()
            );
        }
    }
}
