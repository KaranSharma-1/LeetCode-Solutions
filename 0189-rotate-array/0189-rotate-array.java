// class Solution {
//     void rotateArray(int start , int end, int[]nums){
//         while(start < end){
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         int i = 0;
//         int mid = n - (k%n) - 1;
//         int m = n - 1;
//         rotateArray(i,mid,nums);
//         rotateArray(mid+1,m,nums);
//         rotateArray(i,m,nums);
//     }
// }
class Solution {
    public void rotate(int[] nums, int k) {
    
    k%=nums.length;
    if(k<0)
    {
        k+=nums.length;
    }
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1);
    }
    
    private void reverse(int nums[] , int left , int right)
    {
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    
}
