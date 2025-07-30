package logic1;

public class logic1InOrderEqual {
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk) {
            if (a < b && b < c) {
                return true;
            }
        } else if (equalOk) {
            if (a <= b && b <= c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(inOrderEqual(1, 2, 3, true));
        System.out.println(inOrderEqual(1, 2, 3, false));
        System.out.println(inOrderEqual(3, 2, 1, false));
        System.out.println(inOrderEqual(3, 2, 1, true));
        System.out.println(inOrderEqual(1, 2, 2, false));
        System.out.println(inOrderEqual(1, 2, 2, true));


    }
}
