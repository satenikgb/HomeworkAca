package day25recursion;

public class Recursion {
    /*
    Task1.Write a recursive function
- to find the sum of a given array.
- to find the factorial of a given natural N.
*/
    static int sumArray(int[] array,int n){
        if(n<=0)
            return 0;
        return   sumArray(array,n-1)+array[n-1];
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else

            return n * factorial(n - 1);
    }

    /*
    Task2.Write a fib(int) function which returns n-th fibonacci number.
     */
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib((n - 1)) + fib(n - 2);
    }

    /*
    Task3.We have triangles made of blocks. The topmost row has 1 block, the
next
row down has 2 blocks, the next row has 3 blocks, and so on. Compute
recursively (no loops or multiplication) the total number of blocks in
such a triangle with the given number of rows.
     */
    static int triangleBlock(int n){
        if(n<0)
        return -1;
        return n+triangleBlock(n-1);

    }
    /*
    Task4.Given a non-negative int n, return the sum of its digits recursively (no
loops).
     */
    static int sumnum(int n){
        if(n==0)
            return -1;

        return n%10+sumnum(n/10);
    }
    /*
    Task5.Given a non-negative int n, return the count of the occurrences of 7 as
a digit, so for example 717 yields 2.
     */
    static int countOfOccurances(int n) {
        int count=0;
        if (n == 0)
            return -1;
        if (n % 10 == 7 || n/10==7){
            ++count;
        }
        return count + countOfOccurances(n / 10);
    }

    /*
    Task6.Given a string, compute recursively (no loops) the number of
lowercase 'x' chars in the string.
     */
    static int containX(String s){
        int count=0;
        if(s.length()==0)
            return -1;
        else
        if( s.charAt(s.length()-1)=='x'){
            ++count;
        }
        return count+containX(s.substring(0,s.length()-1));

    }
    /*
    Task7.Given a string, compute recursively a new string where all 'x' chars
have been removed.
     */


/*
8.Write recursive function that reverses the given String.
Example` HELLO -&gt; OLLEH
 */
static String reverseString(String s) {
    if (s.length() == 0) {
        return s;
    } else
        return reverseString(s.substring(1)) + s.charAt(0);

}
/*
Task9.Given a string, compute recursively a new string where all the
lowercase x; chars have been moved to the end of the string.
 */
public static String xTollast(String str) {
    char ch='x';

    if(str.length() < 1) {
        return "";
    }

    String newString = str.substring(1); //Create new string without first character

    if(str.indexOf(ch) == 0) {
        return xTollast(newString) + ch;
    } else {
        return str.charAt(0) + xTollast(newString);
    }
}
/*
Task10.Given a string, return recursively a &quot;cleaned&quot; string where adjacent
chars that are the same have been reduced to a single char. So &quot;yyzzza&quot;
yields &quot;yza&quot;.
 */

    public static String cleanString(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1))
            return cleanString(str.substring(1));
        else
            return str.charAt(0) + cleanString(str.substring(1));

    }
    /*
    Task11.Write a function to determine if a number is prime or not.
     */

    public static boolean isPrimeNumber(int n, int i) {
        if (n < 2)
            return false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrimeNumber(n, i + 1);
    }
    /*
    12.Given a string containing only decimal digits. Find and display the
largest digit.
     */
    public static int greater(String a){

        if (a.length() == 1) {
            return Integer.parseInt(a);
        }
        if (a.charAt(0) > a.charAt(1)) {
            return greater(a.substring(1) + a.charAt(0));
        }
        return greater(a.substring(1));
    }
    /*
    13.You are given a string containing numbers and English letters
(uppercase and lowercase). Find and display the number of digits.
     */
    static int countDigit(String s) {
        int count = 0;
        if (s.length() == 0)
        {  return -1;} else
        if (Character.isDigit(s.charAt(0))) {
            count++;
        }
        return count + countDigit(s.substring(1));

    }


/*
14.Given a string containing only English letters (uppercase and
lowercase). Add the ‘*’ (asterisk) character between letters (you don’t
need to add ‘*’ before the first letter and after the last).
 */
public static String stringnew(String s){
    if(s.length()==1){
        return s;

    }else
        return  s.charAt(0)+""+"*"+stringnew(s.substring(1));
}

public static void main(String[] args) {

}





}
