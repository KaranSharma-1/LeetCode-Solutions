class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[]freq = new int[26];
        ArrayList<Integer> list = new ArrayList<>();
        int length = p.length();
        for(int i = 0; i < length;i++){
            freq[p.charAt(i) - 'a']++;
        }

        int j = 0;
        int count = 0;
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            freq[ch - 'a']--;
            if(freq[ch - 'a'] >= 0){
                count++;
            }
            while(i - j + 1 > length){
                char c = s.charAt(j);
                freq[c - 'a']++;
                if(freq[c - 'a'] > 0)count--;
                j++;
            }
            if(count == length){
                list.add(j);
            }
        }
        return list;
    }
}