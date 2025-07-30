package logic1;

public class logic1SpecialEleven {
    public static boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(specialEleven(11));
        System.out.println(specialEleven(10));
        System.out.println(specialEleven(12));

    }
}
