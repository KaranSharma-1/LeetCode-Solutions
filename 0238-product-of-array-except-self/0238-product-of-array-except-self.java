class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int mult = 1;
        ans[0] = 1;
        for(int i = 0; i< nums.length;i++){
            if(i == 0){continue;}
            ans[i] = ans[i -1]*nums[i - 1];
        }
        for(int i = nums.length - 1; i >= 0;i--){
            ans[i] = ans[i] * mult;
            mult*= nums[i];
        }
        return ans;
    }
}