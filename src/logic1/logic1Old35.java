package logic1;

public class logic1Old35 {
    public static boolean old35(int n) {
        if (n % 3 == 0) {
            if (n % 5 == 0){
                return false;
            }
            return true;
        } else if (n % 5 == 0) {
            if (n % 3 == 0){
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(old35(3));
        System.out.println(old35(5));
        System.out.println(old35(15));
        System.out.println(old35(4));

    }
}
