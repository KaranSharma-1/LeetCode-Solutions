class Solution {
    public char repeatedCharacter(String s) {
        int[]hash = new int[26];
        for(int i = 0;i < s.length();i++){
            hash[s.charAt(i) - 'a']++;
            if(hash[s.charAt(i) - 'a'] == 2){
                return s.charAt(i);
            }
        }
        return '0';
    }
}