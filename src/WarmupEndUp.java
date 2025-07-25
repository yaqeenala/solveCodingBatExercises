public class WarmupEndUp {
    public static String endUp(String str) {
        String newStr = null;
        if (str.length() >= 3) {
            newStr = str.substring(str.length() - 3, str.length());
            str = str.substring(0, str.length() - 3);
            newStr = newStr.toUpperCase();
        } else if (str.length() <= 2) {
            return str.toUpperCase();
        }
        return str + newStr;
    }

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("Hi There"));
        System.out.println(endUp("Hi"));

    }
}
