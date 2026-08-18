class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i = 1;
        int j = 0;
        for(int k = 0; k< weights.length;k++){
            j+= weights[k];
            if(i < weights[k]){
                i = weights[k];
            }
        }
        int ans = 0;
        while( i <= j){
            int mid = i + (j  -i)/2;
            if(canShip(mid,weights,days)){
                ans = mid;
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return ans;
    }
    public boolean canShip(int mid,int[]weights,int days){
            int indx = 0;
            for(int k = 0; k < days && indx < weights.length;k++){
                int sum = 0;
                while(indx < weights.length && sum + weights[indx]<= mid){
                    sum+= weights[indx];
                    indx++;
                }
            }
        return indx == weights.length;
    }
}