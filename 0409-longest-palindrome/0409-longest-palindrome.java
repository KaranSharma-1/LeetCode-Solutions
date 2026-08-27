// class Solution {
//     public int longestPalindrome(String s) {
//         int[] freq = new int[128];
//         for (char c : s.toCharArray()) {
//             freq[c ]++;
//         }
//         int count = 0;
//         boolean odd = false;
//         for (int f : freq) {
//             if (f % 2 == 0) {
//                 count += f;
//             } else {
//                 count += f - 1;
//                 odd = true;
//             }
//         }
//         return odd ? count + 1 : count;
//     }
// }
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        int count = 0;
        boolean odd = false;
        for (int f : freq) {
            count += f / 2 * 2;

            if (f % 2 != 0) {
                odd = true;
            }
        }
        return odd ? count + 1 : count;
    }
}