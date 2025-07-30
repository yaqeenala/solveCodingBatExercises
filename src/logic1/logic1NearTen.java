package logic1;

public class logic1NearTen {
    public static boolean nearTen(int num) {
        if (num % 10 == 8 || num % 10 == 9 || num % 10 == 1 || num % 10 == 2 || num % 10 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(nearTen(8));
        System.out.println(nearTen(9));
        System.out.println(nearTen(10));
        System.out.println(nearTen(11));
        System.out.println(nearTen(12));

    }
}
