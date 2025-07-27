package array1;

public class array1MakeEnds {
    public static int[] makeEnds(int[] nums) {
        int i = nums[0];
        int j = nums[nums.length - 1];
        int[] newArray = {i , j};
        return newArray;

    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(makeEnds(nums));
    }
}
