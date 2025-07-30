package logic1;

public class logic1FizzString {
    public static String fizzString(String str) {
        if ((str.substring(0, 1).equals("f")) && (str.substring(str.length() - 1, str.length()).equals("b"))) {
            str = "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            str = "Fizz";
        } else if(str.substring(str.length() - 1, str.length()).equals("b")) {
            str = "Buzz";
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
        System.out.println(fizzString("hi"));

    }
}
