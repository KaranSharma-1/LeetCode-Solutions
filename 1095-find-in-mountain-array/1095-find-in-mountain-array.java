/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakSearch(mountainArr);
        int end = mountainArr.length() - 1;

        int ans = targetSearch(mountainArr, 0, peak, target, true);

        if(ans != -1) return ans;

        return targetSearch(mountainArr, peak + 1, end, target, false);
    }

    int peakSearch(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(mountainArr.get(mid) > mountainArr.get(mid + 1))
                end = mid;
            else
                start = mid + 1;
        }

        return end;
    }

    int targetSearch(MountainArray mountainArr, int start, int end, int target, boolean isAsc) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int val = mountainArr.get(mid);

            if(val == target) return mid;

            if(isAsc) {
                if(val > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if(val > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }
}