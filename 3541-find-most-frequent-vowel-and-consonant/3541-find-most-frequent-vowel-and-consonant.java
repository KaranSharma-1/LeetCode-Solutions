class Solution {
    public int maxFreqSum(String s) {
        int[] hash = new int[26];
        int maxVowel = 0;
        int maxConsonant = 0;
        for(int i = 0;i< s.length();i++){
            char ch = s.charAt(i);
            hash[ch - 'a']++;
            if(ch  == 'a' || ch  == 'e' || ch  == 'i' || ch  == 'o' || ch  == 'u' ){
                maxVowel = Math.max(hash[ch - 'a'],maxVowel);
            }
            else{
                maxConsonant = Math.max(hash[ch - 'a'],maxConsonant);
            }
        }
        return maxVowel + maxConsonant;
    }
}