class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int i,j;
        int left=0;
        int right;

        Arrays.sort(nums);

        right=nums[nums.length-1]-nums[0];

        while(left<right){
            int mid=left+(right-left)/2;
            int count=0;
            i=0;

            for(j=0;j<nums.length;j++){
                while(nums[j]-nums[i]>mid){
                    i++;
                }

                count=count+j-i;
            }

            if(count>=k){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }

        return left;
    }
}