// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         if(nums1.length <= 0 ||nums2.length <= 0 ){
//             return new int[0];
//         }
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int[]ans = new int[nums1.length];
//         int k = 0;
//         int i = 0;
//         int j = 0;
//         while(i < nums1.length && j < nums2.length){
//             if(nums1[i] > nums2[j]){
//                 j++;
//             }
//             else if(nums1[i] < nums2[j]){
//                 i++;
//             }
//             else{
//                 ans[k++] = nums1[i];
//                 i++;
//                 j++;
//             }
//         }
//         return Arrays.copyOf(ans,k);
//     }
// }
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    int[] freq = new int[1001];
        for (int num : nums1) {
            freq[num]++;
        }
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        for (int num : nums2) {
            if (freq[num] > 0) {
                temp[k++] = num;
                freq[num]--;
            }
        }
        return Arrays.copyOf(temp,k);   
    }
}