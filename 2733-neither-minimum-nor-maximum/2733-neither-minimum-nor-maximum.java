class Solution {
    public int findNonMinOrMax(int[] nums) {
        int ans = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
        }
        for(int i = 0;i < nums.length;i++){
            if(max != nums[i] && min != nums[i]){
                ans = nums[i];
            }
        }
        return ans;
    }
}