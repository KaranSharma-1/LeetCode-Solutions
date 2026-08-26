class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        int j = num;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            long square = (long) mid * mid;
            if (square == num) return true;
            if (square < num) i = mid + 1;
            else j = mid - 1;
        }
        return false;
    }
}