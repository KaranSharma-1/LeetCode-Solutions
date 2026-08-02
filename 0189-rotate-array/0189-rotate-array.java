class Solution {
    void rotateArray(int start , int end, int[]nums){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int mid = n - (k%n) - 1;
        int m = n - 1;
        rotateArray(i,mid,nums);
        rotateArray(mid+1,m,nums);
        rotateArray(i,m,nums);
    }
}