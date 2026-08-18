class Solution {
    public int minDays(int[] bloom, int m, int k) {
        if((long)m*k > bloom.length)return -1;
        int i = 1;
        int j = 0;
        for(int n = 0;n < bloom.length;n++){
            if(j < bloom[n])
            {j = bloom[n];}
        }
        int ans = 0;
        while(i <= j){
            int mid = i + ( j - i)/2;
            int b = 0;
            int max = 0;
            for(int n = 0; n < bloom.length;n++){
                if(bloom[n] <= mid){
                    b++;
                }
                else{
                    max+= b/k;
                    b= 0;
                } 
            }
            max+= b/k;
            if(max >= m){
                ans = mid;
                j = mid - 1;
            }
            else if(max < m){
                i = mid + 1;
            }
            
        }
        return ans;
    }
}