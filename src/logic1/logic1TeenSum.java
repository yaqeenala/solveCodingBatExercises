package logic1;

public class logic1TeenSum {
    public static int teenSum(int a, int b) {
        int sum = a + b;
        if ((13 <= a && a <= 19) || (13 <= b && b <= 19)) {
            sum = 19;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(teenSum(3, 4));
        System.out.println(teenSum(13, 4));
        System.out.println(teenSum(3, 14));

    }
}
