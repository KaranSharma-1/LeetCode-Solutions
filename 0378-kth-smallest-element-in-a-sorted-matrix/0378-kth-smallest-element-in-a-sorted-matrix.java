class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int left=matrix[0][0];
        int n=matrix.length;
        int right=matrix[n-1][n-1];
        while(left<right){
            int mid=left+(right-left)/2;
            int i=0;
            int j=n-1;
            int count=0;
            while(i<n && j>=0){
                if(matrix[i][j]<=mid){
                    count=count+j+1;
                    i++;
                }
                else{
                    j--;
                }
            }

            if(count<k){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }

        return left;
    }
}