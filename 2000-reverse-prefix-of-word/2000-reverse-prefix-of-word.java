class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch) == -1){
            return word;
        }
        int indx = word.indexOf(ch);
        StringBuilder ans = new StringBuilder();
        for(int i = indx; i >= 0;i--){
            ans.append(word.charAt(i));
        }
        for(int i = indx + 1;i< word.length();i++){
            ans.append(word.charAt(i));
        }
        return ans.toString();
    }
}