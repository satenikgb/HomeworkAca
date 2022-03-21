package nestedclass;

public class Outerstatic {
    public static int a=10;
   static class Num{
       private int b=1;
       int c=a+b;

   }

    public static void main(String[] args) {
       Num num=new Num();
        System.out.println(num.c);
    }
}
