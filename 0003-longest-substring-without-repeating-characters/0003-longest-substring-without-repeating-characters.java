class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        int j = 0;
        for(int i = 0 ;i < s.length();i++){
            while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
            }
            set.add(s.charAt(i));
            max = max > i - j + 1 ? max : i - j + 1 ;
        }
        return max;
    }
}