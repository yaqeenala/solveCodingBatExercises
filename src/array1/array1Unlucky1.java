package array1;

public class array1Unlucky1 {
    public static boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        } else if (nums.length >= 2) {
            if ((nums[0] == 1 && nums[1] == 3) ||
                    (nums.length >= 3 && nums[1] == 1 && nums[2] == 3) ||
                    (nums.length >= 3 && nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) ||
                    (nums.length >= 4 && nums[nums.length - 3] == 1 && nums[nums.length - 2] == 3)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(unlucky1(nums));
    }
}
