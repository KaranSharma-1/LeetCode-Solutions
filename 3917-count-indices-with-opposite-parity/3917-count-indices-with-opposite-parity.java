// class Solution {
//     public int[] countOppositeParity(int[] nums) {
//         int n = nums.length;
//         int []count = new int[n];
//         for(int i = 0; i < n - 1;i++){
//             int sum = 0;
//             for(int j = i + 1; j < n;j++){
//                 if(nums[i]%2== 0){
//                     if(nums[j]%2!=0){
//                         sum++;
//                     }
//                 }
//                 else{
//                     if(nums[j]%2==0){
//                         sum++;
//                     }
//                 }
//             }
//             count[i] = sum;
//         }
//         return count;
//     }
// }
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];

        int even = 0;
        int odd = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                count[i] = odd;
                even++;
            } else {
                count[i] = even;
                odd++;
            }
        }

        return count;
    }
}