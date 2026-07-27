class Solution {
    boolean checkPrime(int num){
        boolean isPrime = true;
        if(num<2) return false;
        for(int i=2;i*i<= num;i++){
            if(num%i == 0){
                isPrime = false;
                return false;
            }
        }
        return true;
    }
    public boolean completePrime(int num) {
        if(num<2) return false;
        if(!checkPrime(num)){
            return false;
        }
        int temp = num;
        int suffix = 0;
        int mult = 1;
        while(temp != 0){
            int rem = temp%10;
            suffix = suffix + rem*mult;
            if(!checkPrime(suffix)){
                return false;
            }
            temp/= 10;
            mult*= 10;
        }
        String str = String.valueOf(num);
        int prefix = 0;
        for(int i = 0;i < str.length();i++){
            prefix = prefix*10 + (int)(str.charAt(i) - '0');
            if(!checkPrime(prefix)){
                return false;
            }
        }
        return true;
    }
}