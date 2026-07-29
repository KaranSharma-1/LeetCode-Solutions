class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == 0){
                count++;
            }
        }
        int[] ans = new int[arr.length +  count];
        int k = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == 0){
               ans[k++] = 0;
               ans[k++] = 0;
            }
            else{
                ans[k++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length;i++){
            arr[i] = ans[i];
        }

    }
}