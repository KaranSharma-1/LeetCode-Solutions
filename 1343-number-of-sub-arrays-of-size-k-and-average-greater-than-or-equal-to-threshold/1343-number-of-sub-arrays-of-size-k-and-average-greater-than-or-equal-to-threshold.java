// class Solution {
//     public int numOfSubarrays(int[] arr, int k, int threshold) {
//         int i = 0;
//         int j = i+k;
//         int count = 0;
//         while(j <= arr.length){
//             int sum = 0;
//             for(int m = i;m < j;m++){
//                 sum+= arr[m];
//             }
//             if(sum/k >= threshold){
//                 count++;
//             }
//             i++;
//             j++;
//         }
//         return count;
//     }
// }
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = i + k - 1;
        int count = 0;
        int sum = 0;
        for (int m = i; m <= j; m++) {
            sum += arr[m];
        }
        while (j < arr.length) {
            if (sum >= threshold * k) {
                count++;
            }
            if (j + 1 < arr.length) {
                sum = sum + arr[j + 1] - arr[i];
            }
            j++;
            i++;
        }
        return count;
    }
}