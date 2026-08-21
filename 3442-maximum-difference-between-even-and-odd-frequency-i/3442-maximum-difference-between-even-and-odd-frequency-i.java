class Solution {
    public int maxDifference(String s) {
        int min =  Integer.MAX_VALUE;
        int max = 0;
        int[]freq = new int[26];
        for(int i = 0; i < s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26;i++){
            if(freq[i]%2!= 0 && max < freq[i]){
                max = freq[i];
            }
            if(freq[i]%2== 0 && min > freq[i] && freq[i]!= 0){
                min = freq[i];
            }
        }
        return max - min;
    }
}