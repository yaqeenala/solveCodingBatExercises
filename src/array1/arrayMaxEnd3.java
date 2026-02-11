package array1;

public class arrayMaxEnd3 {

    public static int[] maxEnd3(int[] nums) {
        int i = nums[0];
        int j = nums[nums.length - 1];
        if (i > j) {
            for (int a = 0; a < nums.length; a++) {
                nums[a] = i;
            }
        } else if (j > i) {
            for (int a = 0; a < nums.length; a++) {
                nums[a] = j;
            }
        } else if (j == i) {
            for (int a = 0; a < nums.length; a++) {
                nums[a] = j;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 3, 2};
        System.out.println(maxEnd3(nums));
    }
}
