class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length;i++){
            StringBuilder check = new StringBuilder(words[i]);
            if(words[i].equals(check.reverse().toString())){
                return words[i];
            }
        }
        return "";
    }
}