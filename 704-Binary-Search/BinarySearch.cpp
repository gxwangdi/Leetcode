class Solution {
public:
    int search(vector<int>& nums, int target) {
        if (nums.size() <1) {
            return -1;
        }
        int left = 0;
        int right = nums.size()-1;
        while (left +1 < right) {
            int mid = left + (right-left)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid+1;
                continue;
            }
            right = mid-1;
        }
        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }
};
