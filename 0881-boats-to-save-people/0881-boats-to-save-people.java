class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people.length <=1)return 1;
        Arrays.sort(people);
        int count = 0;
        int i = 0;
        int j = people.length - 1;
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
            }
                count++;
                j--;
        }
        return count;
    }
}