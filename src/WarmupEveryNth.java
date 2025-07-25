public class WarmupEveryNth {
    public static String everyNth(String str, int n) {
        String result = "";

        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(everyNth("Hello", 2));
        System.out.println(everyNth("Good Morning", 3));

    }
}
