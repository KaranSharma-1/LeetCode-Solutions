// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int i = 0;
//         int j = nums.length - 1;
//         while(i <= j){
//             if(nums[i] == val && nums[j]!= val){
//                 int temp =nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 j--;
//                 i++;
//             }
//             else if(nums[i] == val && nums[j] == val){
//                 j--;
//             }
//             else{
//                 i++;
//             }
//         }
//         return i;
//     }
// }
class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;
        int n = nums.length;
        for(int i = 0; i<n;  i++)
        {
          if(nums[i]!= val)
          {
            nums[k++]=nums[i];
          }

        }
        return k;
        

    }
}