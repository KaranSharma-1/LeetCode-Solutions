class Solution {
    public String reverseWords(String s) {
        int j = 0;
        StringBuilder str = new StringBuilder();
        for(int k = 0;k < s.length();k++){
            if(s.charAt(k) == ' '){
                int i = k - 1;
                while( i >= j ){
                    str.append(s.charAt(i));
                    i--;
                }
                j = k+1;
                str.append(' ');
            }
             if(k == s.length() - 1){
                int i = k;
                while( i >= j ){
                    str.append(s.charAt(i));
                    i--;
                }
            }
        }
        return str.toString();
    }
}