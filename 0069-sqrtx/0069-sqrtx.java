// class Solution {
//     public int mySqrt(int x) {
//         long i = 0;
//         long j = x;
//         int ans = 0;
//         while(i < j){
//             long mid = i + ( j - i)/2;
//             if(mid * mid == x){
//                 return (int)mid;
//             }
//             else if(mid * mid > x){
//                 j = mid;
//             }
//             else{
//                 ans = (int)mid;
//                 i = mid + 1;
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int i = 1;
        int j = x / 2;
        int ans = 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if ((long) mid * mid == x) {
                return mid;
            }
            else if ((long) mid * mid < x) {
                ans = mid;
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }

        return ans;
    }
}