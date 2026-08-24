class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (s == e) {
                return nums[s];
            }

            int currentValue = nums[mid];

            int prevValue = -1;
            if (mid - 1 >= 0) {
                prevValue = nums[mid - 1];
            }

            int nextValue = -1;
            if (mid + 1 < n) {
                nextValue = nums[mid + 1];
            }

            if (currentValue != prevValue && currentValue != nextValue) {
                return currentValue;
            }

            if (currentValue != prevValue && currentValue == nextValue) {
                int startIndex = mid;

                if ((startIndex & 1) == 1) {
                    // Odd
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }

            } else if (currentValue == prevValue && currentValue != nextValue) {
                int endIndex = mid;

                if ((endIndex & 1) == 1) {
                    // Odd
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }
}