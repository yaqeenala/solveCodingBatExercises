package logic1;

public class logic1TwoAsOne {
    public static boolean twoAsOne(int a, int b, int c) {
    if (a == b + c || b == a + c || c == b + a) {
        return true;
    }
    return false;
    }

    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(1, 5, 3));

    }


}
