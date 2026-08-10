// class Solution {
//     public String reverseWords(String s) {
//         int j = 0;
//         StringBuilder str = new StringBuilder();
//         for(int k = 0;k < s.length();k++){
//             if(s.charAt(k) == ' '){
//                 int i = k - 1;
//                 while( i >= j ){
//                     str.append(s.charAt(i));
//                     i--;
//                 }
//                 j = k+1;
//                 str.append(' ');
//             }
//              if(k == s.length() - 1){
//                 int i = k;
//                 while( i >= j ){
//                     str.append(s.charAt(i));
//                     i--;
//                 }
//             }
//         }
//         return str.toString();
//     }
// }
class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                int left = start;
                int right = end - 1;
                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                start = end + 1;
            }
        }

        return new String(arr);
    }
}