class Solution {
    public int maxDistinct(String s) {
        int[] hash = new int[26];
        int count = 0;
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            hash[ch - 'a']++;
            if(hash[ch -'a']  ==1){
                count++;
            }
        }
        return count;
    }
}