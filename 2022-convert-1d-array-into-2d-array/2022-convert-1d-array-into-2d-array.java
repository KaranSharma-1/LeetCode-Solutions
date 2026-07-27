// class Solution {
//     public int[][] construct2DArray(int[] original, int m, int n) {
//         int[][] ans = new int[0][0];
//         int k = 0;
//         if(m*n < original.length || m*n > original.length)return ans;
//         int[][] ans1 = new int[m][n];
//         for(int i = 0; i < m;i++){
//             for(int j = 0;j <n;j++){
//                 ans1[i][j] = original[k++];
//             }
//         } 
//         return ans1;
//     }
// }
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) return new int[0][0];
        int k = 0;
        int[][] ans = new int[m][n];
        for(int i = 0; i < m;i++){
            for(int j = 0;j <n;j++){
                ans[i][j] = original[k++];
            }
        }
        return ans;
    }
}