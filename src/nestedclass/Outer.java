package nestedclass;

public class Outer {
    private String str = "greating";

    protected class Inner {
        public int repeat = 4;

        public void print() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.print();
    }
}
