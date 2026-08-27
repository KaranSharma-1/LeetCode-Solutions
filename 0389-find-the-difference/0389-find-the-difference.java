class Solution {
    public char findTheDifference(String s, String t) {
        char xor = 0;
        for(char sr  : s.toCharArray()){
            xor^= sr;
        }
        for(char sr  : t.toCharArray()){
            xor^= sr;
        }
        return xor;
    }
}