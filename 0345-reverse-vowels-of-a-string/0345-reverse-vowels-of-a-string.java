class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;
        String vowels = "aeiou";

        while (i < j) {
            char ch = Character.toLowerCase(str[i]);
            char ch2 = Character.toLowerCase(str[j]);

            int idx1 = vowels.indexOf(ch);
            int idx2 = vowels.indexOf(ch2);

            if (idx1 != -1 && idx2 != -1) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
            else if (idx1 == -1 && idx2 == -1) {
                i++;
                j--;
            }
            else if (idx1 != -1 && idx2 == -1) {
                j--;
            }
            else {
                i++;
            }
        }

        return new String(str);
    }
}