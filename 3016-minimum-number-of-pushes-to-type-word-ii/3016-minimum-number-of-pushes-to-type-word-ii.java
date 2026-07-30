// class Solution {
//     public int minimumPushes(String word) {
//         int[]freq = new int[26];
//         int ans = 0;
//         char[] arr = word.toCharArray();
//         for(int i = 0; i < arr.length;i++){
//             freq[arr[i] - 'a']++;
//         }
//         Arrays.sort(freq);
//         for(int i = 25;i >= 0;i--){
//             if(freq[i] == 0)break;
//             int rank = 25 - i;
//             ans = ans + (((rank/8) + 1)*freq[i]);
//         }
//         return ans;
//     }
// }
// class Solution {
//     public int minimumPushes(String word) {
//         int[] freq = new int[26];
//         for (char c : word.toCharArray()) {
//             freq[c - 'a']++;
//         }

//         Arrays.sort(freq);

//         int totalPushes = 0;
//         int rank = 0;

//         for (int i = 25; i >= 0 && freq[i] > 0; i--, rank++) {
//             int pushCost = (rank / 8) + 1;
//             totalPushes += pushCost * freq[i];
//         }

//         return totalPushes;
//     }
// }
class Solution {
    public int minimumPushes(String word) {
        int[]arr=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int c=0;
        int ans=0;
        for(int i=25;i>=0;i--){
            int t=(c/8)+1;
            ans+=t*arr[i];
            c++;
        }
        return ans;
    }
}