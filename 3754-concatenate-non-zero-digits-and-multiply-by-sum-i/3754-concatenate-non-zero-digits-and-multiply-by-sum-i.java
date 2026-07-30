class Solution {
    public long sumAndMultiply(int n) {
        long num = 0;
        long sum = 0;
        int place = 1;
        while( n > 0){
            int rem = n%10;
            if(rem !=0){
                num = num + rem*place;
                sum+= rem;
                place*= 10;
            }
            n/= 10;
        }
        long ans = num * sum;
    return ans;
    }
}