// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!= t.length())return false;
//         char[] char1 = s.toCharArray();
//         Arrays.sort(char1);
//         char[] char2 = t.toCharArray();
//         Arrays.sort(char2);
//         for(int i = 0;i < char1.length;i++){
//             if(char1[i]!= char2[i])return false;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())return false;
        int[]hash1 = new int[26];
        int[]hash2 = new int[26];
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        for(int i = 0;i < char1.length;i++){
            hash1[char1[i] - 'a']++;
            hash2[char2[i] - 'a']++;
        }
        for(int i = 0;i < hash1.length;i++){
            if(hash1[i]!=hash2[i])return false;
        }
        return true;
    }
}