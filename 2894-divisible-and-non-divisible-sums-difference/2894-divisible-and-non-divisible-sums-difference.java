// class Solution {
//     public int differenceOfSums(int n, int m) {
//         int sum = n*(n + 1)/2;
//         for(int i = 1; i<= n;i++){
//             if(i%m == 0){
//                 sum-= 2*i;
//             }
//         }
//         return sum;
//     }
// }
class Solution {
    public int differenceOfSums(int n, int m) {
        int total = n * (n + 1) / 2;
        int k = n / m;
        int divisible = m * k * (k + 1) / 2;

        return total - 2 * divisible;
    }
}