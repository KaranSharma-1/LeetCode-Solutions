class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0;i < s.length();i++){
            int ch = Math.abs(s.charAt(i) - 'z')+1;
            sum = sum + ch*(i+1);
        }
        return sum;
    }
}