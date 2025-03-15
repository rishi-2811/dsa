import java.util.*;

class Solution {
    public int findMin(int[] nums) {
        return binarySearchMin(nums, 0, nums.length - 1, Integer.MAX_VALUE);
    }

    private int binarySearchMin(int[] nums, int low, int high, int min) {
        if (low > high) {
            return min;
        }
        
        if (nums[low] < nums[high]) {
            return Math.min(min, nums[low]);
        }
        
        int mid = (low + high) / 2;
        min = Math.min(min, nums[mid]);
        
        if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
            return Math.min(binarySearchMin(nums, mid + 1, high, min),binarySearchMin(nums, low, mid-1, min));
        } else if (nums[mid] >= nums[low]) {
            return binarySearchMin(nums, mid + 1, high, min);
        } else {
            return binarySearchMin(nums, low, mid - 1, min);
        }
    }
}
