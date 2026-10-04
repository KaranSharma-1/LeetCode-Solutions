class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int num : arr1){
            boolean check = true;
            for(int num2 : arr2){
                if(Math.abs(num - num2) <= d){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
            }
        }
        return count;
    }
}