public class WarmupStartOz {
    public static String startOz(String str) {
        if (str.length() >= 2 && str.substring(0, 1).equals("o") && str.substring(1, 2).equals("z")) {
            return "oz";
        } else if (str.length() >= 1 && str.substring(0, 1).equals("o")) {
            return "o";
        } else if (str.length() >= 2 && str.substring(1, 2).equals("z")) {
            return "z";
        }

        return "";
    }
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
        System.out.println(startOz("zoo"));

    }
}
