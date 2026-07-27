class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] notPrime = new boolean[n];
        for(int i = 2;i*i< n;i++){
            if(!notPrime[i]){
               for(int j = i; i*j < n;j++){
                notPrime[i*j] = true;
               }
            }
        }
        for(int i = 2;i < notPrime.length;i++){
            if(!notPrime[i]){
                count++;
            }
        }
        return count;
    }
}