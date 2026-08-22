class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(num>0){
            int k=num%10;
            if(temp%k==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}