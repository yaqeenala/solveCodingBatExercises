package array1;

public class array1MidThree {
    public static int[] midThree(int[] nums) {
        int a = nums.length / 2;
        int i =nums[a - 1];
        int j = nums[a];
        int l = nums[a + 1];
        int[] newArray = {i, j, l};
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(midThree(nums));
    }
}
