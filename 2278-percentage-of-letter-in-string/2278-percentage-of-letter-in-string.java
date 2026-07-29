class Solution {
    public int percentageLetter(String s, char letter) {
        double count = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        int ans = (int)(count/s.length()*100);
        return ans;
    }
}