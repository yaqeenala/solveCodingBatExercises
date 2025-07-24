//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Warmup {
    public static boolean makes10(int a, int b) {
        int c = a + b;
        if (a == 10 || b == 10 || c == 10){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(makes10(5, 5));


    }
}