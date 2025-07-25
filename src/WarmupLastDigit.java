public class WarmupLastDigit {
    public static boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(lastDigit(10, 20));
        System.out.println(lastDigit(11, 20));

    }
}
