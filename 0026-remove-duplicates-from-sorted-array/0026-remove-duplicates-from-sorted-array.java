// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int i = 0;
//         int j = i+1;
//         int count = 1;
//         while(j <nums.length){
//             if(nums[i]!=nums[j]){
//                 count++;
//                 i++;
//                 nums[i] = nums[j];
//             }
//             j++;
//         }
//         return count;
//     }
// }
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}