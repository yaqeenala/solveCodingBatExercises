public class WarmupStartHi {

    public static boolean startHi(String str) {
        String startWithHi = "hi";
        if (str.length() >= 2 && str.substring(0, 2).equals(startWithHi)) {
            return true;
        }
        return false;
    } 

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
        System.out.println(startHi("he"));
        System.out.println(startHi(""));
    }
}
