class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer > count = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < nums.length){
            count.put(nums[j],count.getOrDefault(nums[j],0) + 1);
            int freq = count.get(nums[j]);
            while(freq > k){
                count.put(nums[i],count.get(nums[i]) - 1);
                freq = count.get(nums[j]);
                i++;
            }
            max = Math.max(j-i+1,max);
            j++;
        }
        return max;
    }
}