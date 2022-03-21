package nestedclass;

public class Outerlocal {
    final int l = 6;

    public void calculate() {
        final int a = 10;
        class B {
            public void multiply() {
                System.out.println(l * a);
            }
        }
        B b = new B();
        b.multiply();
    }

    public static void main(String[] args) {
        Outerlocal o = new Outerlocal();
        o.calculate();

    }
}
