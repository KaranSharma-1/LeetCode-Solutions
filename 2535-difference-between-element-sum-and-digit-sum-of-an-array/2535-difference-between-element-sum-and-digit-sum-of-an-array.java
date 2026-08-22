class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digSum = 0;
        for (int num : nums) {
            sum += num;
            while (num > 0) {
                digSum += num % 10;
                num /= 10;
            }
        }
        return Math.abs(sum - digSum);
    }
}