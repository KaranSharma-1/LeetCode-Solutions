class Solution {
    int gcd(int i , int j){
        while(j!= 0){
            int temp = j;
            j = i%j;
            i = temp;
        }
        return i;
    }
    public long maxPairStrength(int[] nums) {
        long max = 0;
        for(int i = 0;i < nums.length - 1;i++){
            long ans = 0;
      for(int j = i+1;j < nums.length;j++){
        int g = gcd(nums[i],nums[j]);
        ans = (long)(nums[i]/g)*(nums[j]/g);
        max = Math.max(ans,max);
      }
    }
    return max;
}
}