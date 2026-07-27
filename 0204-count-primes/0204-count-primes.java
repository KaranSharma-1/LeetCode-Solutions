// class Solution {
//     public int countPrimes(int n) {
//         int count = 0;
//         boolean[] notPrime = new boolean[n];
//         for(int i = 2;i*i< n;i++){
//             if(!notPrime[i]){
//                for(int j = i; i*j < n;j++){
//                 notPrime[i*j] = true;
//                }
//             }
//         }
//         for(int i = 2;i < notPrime.length;i++){
//             if(!notPrime[i]){
//                 count++;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        for(int i=2;i*i<n;i++){
            if(!isNotPrime[i]){
                for(int j = i*i; j<n; j+=i){
                    isNotPrime[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
            }
        }

        return count;
    }
}