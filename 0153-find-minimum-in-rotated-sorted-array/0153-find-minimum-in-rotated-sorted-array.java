class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = nums.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            min = Math.min(min, nums[mid]);
            if(nums[j] < nums[mid]){
                i = mid + 1;
            }
            else if(nums[j] > nums[mid]){
                j = mid;
            }
            else{
                j--;
            }
        }
        return min;
    }
}