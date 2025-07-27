package array1;

public class array1Sum3 {
    public static int sum3(int[] nums) {
        int i = nums[0];
        int j = nums[1];
        int m = nums[2];
        return i + j + m;

    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        System.out.println(sum3(nums));
    }

}
