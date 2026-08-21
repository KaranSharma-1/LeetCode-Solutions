class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int apples = 0;
        for(int i = 0; i< apple.length;i++){
            apples+= apple[i];
        }
        int cap = 0;
        int i = capacity.length - 1;
        int count = 0;
        while(cap < apples){
            cap+= capacity[i--];
            count++;
        }
        return count;
    }
}