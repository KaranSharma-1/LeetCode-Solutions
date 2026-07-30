class Solution {
    public int minimumPushes(String word) {
        int[]freq = new int[26];
        int ans = 0;
        char[] arr = word.toCharArray();
        for(int i = 0; i < arr.length;i++){
            freq[arr[i] - 'a']++;
        }
        Arrays.sort(freq);
        for(int i = 25;i >= 0;i--){
            if(freq[i] == 0)break;
            ans = ans + ((((25 - i)/8) + 1)*freq[i]);
        }
        return ans;
    }
}