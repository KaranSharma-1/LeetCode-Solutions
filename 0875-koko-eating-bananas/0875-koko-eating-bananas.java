// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int i = 1;
//         int j = 0;
//         for(int k = 0;k < piles.length;k++){
//             if( j < piles[k]){
//                 j = piles[k];
//             }
//         }
//         int min = 0;
//         while(i <= j){
//             int mid = i + (j - i )/2;
//             int hrs = 0;
//             for(int k = 0;k < piles.length;k++){
//                 hrs+=piles[k]/mid;
//                 if(piles[k]%mid!=0) hrs++;
//             }
//             if(hrs <= h){
//                 min =mid;
//                 j = mid - 1;
//             }
//             else {
//                 i = mid+1;
//             }
//         }
//         return min;
//     }
// }
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}