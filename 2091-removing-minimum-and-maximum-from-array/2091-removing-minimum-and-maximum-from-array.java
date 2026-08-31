// class Solution {
//     public int minimumDeletions(int[] nums) {
//         int min = Integer.MAX_VALUE;
//         int max = 0;
//         int n = nums.length;
//         int indMin = 0;
//         int indMax = 0;
//         int ans = 0;
//         for(int i = 0; i < n;i++){
//             if(max < nums[i]){
//                 max = nums[i];
//                 indMax = i;
//             }
//             if(min > nums[i]){
//                 min = nums[i];
//                 indMin = i;
//             }
//         }
//         //from left 
//         ans = Math.max(indMax,indMin) + 1;
//         // right 
//         ans = Math.min(ans,n - Math.min(indMax,indMin));
//         //one from left one from right
//         ans = Math.min(ans,(Math.min(indMax,indMin)+1 + n - Math.max(indMax,indMin)));
//         return ans;
//     }
// }
//cleaner version
class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex])
                minIndex = i;

            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        }

        int left = Math.max(minIndex, maxIndex) + 1;

        int right = n - Math.min(minIndex, maxIndex);

        int both = Math.min(minIndex, maxIndex) + 1
                 + n - Math.max(minIndex, maxIndex);

        return Math.min(left, Math.min(right, both));
    }
}