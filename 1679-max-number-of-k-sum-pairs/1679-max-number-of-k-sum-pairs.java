//cleaner
// class Solution {
//     public int maxOperations(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int count = 0;
//         for (int num : nums) {
//             int complement = k - num;
//             Integer freq = map.get(complement);
//             if (freq != null) {
//                 if (freq == 1)
//                     map.remove(complement);
//                 else
//                     map.put(complement, freq - 1);
//                 count++;
//             } else {
//                 map.put(num, map.getOrDefault(num, 0) + 1);
//             }
//         }
//         return count;
//     }
// }
//two pointer by sorting
class Solution {
    public int maxOperations(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            int s = nums[i] + nums[j];
            if(s == k){
                res++;
                i++;
                j--;
            } else if(s > k){
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}