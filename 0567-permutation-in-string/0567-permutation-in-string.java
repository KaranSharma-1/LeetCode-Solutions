class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[]freq = new int[26];
        for(int i = 0; i < s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int j = 0;
        int count = 0;
        for(int i = 0; i < s2.length();i++){
            char ch = s2.charAt(i);
            freq[ch - 'a']--;
            if(freq[ch - 'a'] >= 0){
                count++;
            }
            while(i - j + 1 > s1.length()){
                char c = s2.charAt(j);
                freq[c - 'a']++;
                if(freq[c - 'a'] > 0)count--;
                j++;
            }
            if(count == s1.length()){
                return true;
            }
        }
        return false;
    }
}