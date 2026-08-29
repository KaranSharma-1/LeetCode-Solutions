class Solution {
    public int numberOfSubstrings(String s) {
        int j = 0;
        int[]freq = new int[3];
        int count = 0;
        for(int i = 0;i < s.length();i++){
            freq[s.charAt(i) - 'a']++;
            while((freq[0] != 0 && freq[1] != 0 && freq[2] != 0)){
                freq[s.charAt(j) - 'a']--;
                j++;
            }
            count+=j;
        }
        return count;
    }
}