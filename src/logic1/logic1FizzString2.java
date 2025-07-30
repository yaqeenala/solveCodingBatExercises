package logic1;

public class logic1FizzString2 {
    public static String fizzString2(int n) {
        String newStr = null;
        if (n % 3 == 0 && n % 5 == 0) {
            newStr = "FizzBuzz!";
        } else if (n % 3 == 0) {
            newStr = "Fizz!";
        } else if (n % 5 == 0) {
            newStr = "Buzz!";
        } else {
            newStr = n + "!";
        }
        return newStr;

    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(fizzString2(i));
        }
    }
}
