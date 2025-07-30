package logic1;

public class logic1LastDigit {
    public static boolean lastDigit(int a, int b, int c) {
        if (a % 10 == b % 10 || a % 10 == c % 10 || c % 10 == b % 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(10, 20, 30));
        System.out.println(lastDigit(10, 21, 31));
        System.out.println(lastDigit(10, 21, 32));

    }
}
