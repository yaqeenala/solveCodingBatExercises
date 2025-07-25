public class WarmupMixStart {
    public static boolean mixStart(String str) {
        if (str.length() <= 2) {
            return false;
        } else if (str.length() > 2 && str.substring(1, 3).equals("ix")) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("next"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("n"));

    }
}
