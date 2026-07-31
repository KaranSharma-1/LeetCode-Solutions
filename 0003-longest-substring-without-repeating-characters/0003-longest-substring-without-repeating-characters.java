// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int max = 0;
//         HashSet<Character> set = new HashSet<>();
//         int j = 0;
//         for(int i = 0 ;i < s.length();i++){
//             while(set.contains(s.charAt(i))){
//                     set.remove(s.charAt(j));
//                     j++;
//             }
//             set.add(s.charAt(i));
//             max = max > i - j + 1 ? max : i - j + 1 ;
//         }
//         return max;
//     }
// }
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);
        int j = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastSeen[c] != -1 && lastSeen[c] >= j) {
                j = lastSeen[c] + 1;
            }
            lastSeen[c] = i;
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}