package array1;

public class array1No23 {
    public static boolean no23(int[] nums) {
        for(int i = 0; i <= 1; i ++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4};
        System.out.println(no23(nums));
    }
}
