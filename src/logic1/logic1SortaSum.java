package logic1;

public class logic1SortaSum {
    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (10 <= sum && sum <= 19){
            return 20;
        }
        return sum;
    }

    public static void main(String[] args) {
     System.out.println(sortaSum(12, 3));
        System.out.println(sortaSum(12, 31));

    }
}
