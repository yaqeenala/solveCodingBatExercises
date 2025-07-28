package array1;

public class array1MaxTriple {
    public static int maxTriple(int[] nums) {
        int largestValue = 0;
        if (nums.length >= 1) {
            int a = nums[0];
            int b = nums[nums.length / 2];
            int c = nums[nums.length - 1];
            if (a == b && a == c) {
                largestValue = a;
            } else if (a > b && a > c) {
                largestValue =  a;
            } else if (b > a && b > c) {
                largestValue = b;
            } else if (c > a && c > b) {
                largestValue = c;
            }
        }
        return largestValue;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(maxTriple(nums));
    }
}
