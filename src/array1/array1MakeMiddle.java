package array1;

public class array1MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
        int i = nums[nums.length/2 -1];
        int j = nums[nums.length / 2];
        int[] newArray = {i, j};
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(makeMiddle(nums));
    }
}
