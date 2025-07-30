package logic1;

public class logic1InOrder {
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            if (c > b) {
                return true;
            }
        } else if (!bOk) {
            if (b > a && c > b) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 4, false));
        System.out.println(inOrder(1, 2, 1, false));
        System.out.println(inOrder(1, 1, 2, true));
    }
}
