class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer > count = new HashMap<>();
        int i = 0;
        int max = 0;
        for(int j = 0;j < nums.length;j++){
            count.put(nums[j],count.getOrDefault(nums[j],0) + 1);
            while(count.get(nums[j]) > k){
                count.put(nums[i],count.get(nums[i]) - 1);
                i++;
            }
            max = Math.max(j-i+1,max);
        }
        return max;
    }
}