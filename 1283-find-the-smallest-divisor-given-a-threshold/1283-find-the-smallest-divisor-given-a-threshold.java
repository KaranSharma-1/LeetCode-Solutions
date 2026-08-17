// class Solution {
//     public int smallestDivisor(int[] nums, int threshold) {
//         int i = 1;
//         int j = 0;
//         for(int num : nums){
//             if(j < num)j = num;
//         }
//         int ans = 0;
//         while(i <= j){
//             int mid = i + ( j - i )/2;
//             int sum = 0;
//             for(int num : nums){
//                 sum+= num/mid;
//                 if(num % mid != 0){
//                     sum++;
//                 }
//             }
//             if(sum <= threshold){
//                 ans = mid;
//                 j = mid - 1;
//             }
//             else{
//                 i = mid + 1;
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;

        for (int num : nums)
            high = Math.max(high, num);

        while (low < high) {
            int mid = low + (high - low) / 2;
            long sum = 0;

            for (int num : nums)
                sum += (num + mid - 1) / mid;

            if (sum <= threshold)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }
}