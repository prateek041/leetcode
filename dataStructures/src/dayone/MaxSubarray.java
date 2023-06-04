package dayone;

public class MaxSubarray {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    // The brute force approach i.e. getting sum of every sub array.
    public static int maxSubArray(int []nums){
        // calculate all the possible sub arrays here
        int length = nums.length;
        int max = nums[0]; // let's consider the first sub array to be the largest
        // This loop decides the first value
        for (int i = 0; i < length; i++) {
            // This loop decides the second value
            for (int j = i; j < length; j++) {
                int sum = 0;
                // This loop is summing thing up
                for (int k = i; k < j; k++) {
                    sum = sum + nums[k];
                }
                if (max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }
}
