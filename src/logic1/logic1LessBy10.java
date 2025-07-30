package logic1;

public class logic1LessBy10 {
    public static boolean lessBy10(int a, int b, int c) {
        if (Math.abs(a-b) >= 10 || Math.abs(a-c) >= 10 || Math.abs(c-b) >= 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 11));
        System.out.println(lessBy10(1, 7, 10));

    }
}
