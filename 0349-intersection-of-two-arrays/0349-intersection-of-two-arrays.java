class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int resultSize = 0;

        for (int num : nums1) {
            seen[num] = true;
        }

        for (int num : nums2) {
            if (seen[num]) {
                result[resultSize] = num;
                
                seen[num] = false;
                resultSize++;
            }
        }

        return Arrays.copyOf(result, resultSize);
    }
}