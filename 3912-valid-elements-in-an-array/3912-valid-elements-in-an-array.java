class Solution {
    public List<Integer> findValidElements(int[] nums) {
        boolean[] ans = new boolean[nums.length];

        int left = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > left) {
                ans[i] = true;
                left = nums[i];
            }
        }

        int right = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > right) {
                ans[i] = true;
                right = nums[i];
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (ans[i]) {
                list.add(nums[i]);
            }
        }

        return list;
    }
}