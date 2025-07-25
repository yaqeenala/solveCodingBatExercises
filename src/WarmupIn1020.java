public class WarmupIn1020 {
    public static boolean in1020(int a, int b) {
        if ((10 <= a && a <= 20) || (10 <= b && b <= 20)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));
        System.out.println(in1020(99, 10));
        System.out.println(in1020(20, 20));
        System.out.println(in1020(9, 9));


    }
}
