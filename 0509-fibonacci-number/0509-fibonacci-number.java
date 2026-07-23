class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int next;
        for(int i =0;i< n;i++){
            next = a+b;
            a = b;
            b = next;
            
        }
        return a;
    }
}