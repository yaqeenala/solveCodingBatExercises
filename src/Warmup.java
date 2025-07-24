//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Warmup {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(sleepIn(false, true));


    }
}