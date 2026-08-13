class Solution {
    public int candy(int[] rating) {
        int n = rating.length;
        int[] candy = new int[n];
        for(int k = 0; k < n;k++){
            candy[k] = 1;
        }
        //left -> right
        for(int k = 1;k <n;k++){
            if(rating[k] > rating[k - 1]){
                candy[k] = candy[k - 1] + 1;
            }
        }
        //right -> left
        for(int k = n - 2;k >= 0;k--){
            if(rating[k] > rating[k + 1]){
                candy[k] = Math.max(candy[k],candy[k + 1] + 1);
            }
        }
        int sum = 0;
        for(int k = 0;k < n;k++){
            sum+= candy[k];
        }
        return sum;
    }
}