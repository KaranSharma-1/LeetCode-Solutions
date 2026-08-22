// class Solution {
//     public boolean isThree(int n) {
//         int count = 0;
//         for(int i = 1; i <= n;i++){
//             if(n%i == 0){
//                 count++;
//             }
//         }
//         return count == 3;
//     }
// }
class Solution {
    public boolean isThree(int n) {
        int root = (int) Math.sqrt(n);

        if (root * root != n) {
            return false;
        }

        for (int i = 2; i * i <= root; i++) {
            if (root % i == 0) {
                return false;
            }
        }

        return root > 1;
    }
}