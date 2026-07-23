class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ans = new int[nums1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(  i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else {
                ans[k++] = nums1[i];
                i++;
                j++;
            }
        }
        int[] fans = new int[k];
        int m = 0;
        for(int z = 0;z < k;z++){
            if(z > 0 && ans[z] == ans[z-1]){
                continue;
            }
            else{
            fans[m++] = ans[z];}
        }
        return Arrays.copyOf(fans,m);
    }
}