package array1;

public class array1Double23 {
    public static boolean double23(int[] nums) {
        if (nums.length == 2) {
            if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
                return true;
            }
        } else if (nums.length == 1) {
            if ((nums[0] == 2) || (nums[0] == 3)) {
                return false;
            }
        } else if (nums.length == 0) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        System.out.println(double23(nums));
    }
}
