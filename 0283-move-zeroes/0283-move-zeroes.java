// class Solution {
//     public void moveZeroes(int[] nums) {
//         int i = 0;
//         int j = i+1 ;
//         while(j < nums.length){
//             if(nums[i] == 0 && nums[j]!=0){
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 j++;
//                 i++;
//             }
//             else if(nums[i]!=0){
//                 i++;
//                 j++;
//             }
//             else{
//                 j++;
//             }
//         }
//     }
// }
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;   
        } 
    }
}