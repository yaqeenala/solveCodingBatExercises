package array1;

public class array1Sum2 {
    public static int sum2(int[] nums) {
        int sum = 0;
        if (nums.length == 0) {
            sum = 0;
        } else if (nums.length == 1) {
            sum = nums[0];
        }  else if (nums.length >= 2) {
            sum = nums[0] + nums[1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {21, 2, 9, 0};
        System.out.println(sum2(nums));
    }
}
