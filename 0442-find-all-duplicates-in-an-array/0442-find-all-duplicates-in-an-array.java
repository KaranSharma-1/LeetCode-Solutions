class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> list = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for(int i = 0;i < nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]] > 1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}