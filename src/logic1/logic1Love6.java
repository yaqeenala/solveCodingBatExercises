package logic1;

public class logic1Love6 {
    public static boolean love6(int a, int b) {
        int sum = a + b;
        int difference = Math.abs(a - b);
        if (a == 6 || b == 6 || sum == 6 || difference == 6) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(love6(6, 4));
        System.out.println(love6(6, 0));
        System.out.println(love6(3, 3));
        System.out.println(love6(5, 4));


    }
}
