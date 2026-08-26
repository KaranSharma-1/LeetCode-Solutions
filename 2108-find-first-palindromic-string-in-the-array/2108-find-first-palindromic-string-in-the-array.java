// class Solution {
//     public String firstPalindrome(String[] words) {
//         for(int i = 0; i < words.length;i++){
//             StringBuilder check = new StringBuilder(words[i]);
//             if(words[i].equals(check.reverse().toString())){
//                 return words[i];
//             }
//         }
//         return "";
//     }
// }
class Solution {
    public String firstPalindrome(String[] words) {
      for (String word : words) {
        if (isPalindrome(word)) {
            return word;
        }
      }  
      return "";
    }
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) { 
                return false;
            }
            left++;
            right--;
        }
        return true;

    } 
}