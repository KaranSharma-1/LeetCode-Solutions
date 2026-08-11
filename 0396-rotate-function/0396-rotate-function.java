// class Solution {
//     int fun(int[]nums){
//         int ans = 0;
//         for(int i = 0;i < nums.length;i++){
//             ans+= i*nums[i];
//         }
//         return ans;
//     }
//     public int maxRotateFunction(int[] nums) {
//         int rotations = nums.length;
//         int max = Integer.MIN_VALUE;
//         int n = nums.length;
//         for(int k = 0; k < rotations;k++){
//             max = Math.max(max,fun(nums));
//             int temp = nums[n - 1];
//             for(int i = n -1; i> 0;i--){
//                 nums[i] = nums[i - 1];
//             }
//             nums[0] = temp;
//         }
//         return max;
//     }
// }
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        long sum = 0;
        long current = 0;

        // Calculate sum and F(0)
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            current += (long) i * nums[i];
        }

        long max = current;

        // Calculate F(1), F(2), ...
        for (int i = n - 1; i > 0; i--) {
            current = current + sum - (long) n * nums[i];
            max = Math.max(max, current);
        }

        return (int) max;
    }
}