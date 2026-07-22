class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum+= nums[i];
        }
        for(int i = 0;i < nums.length;i++){
            if(i>0)
            {leftSum+= nums[i - 1];}
            rightSum= sum -leftSum - nums[i];
            ans[i] = Math.abs(rightSum- leftSum);
        }
        return ans;
    }
}