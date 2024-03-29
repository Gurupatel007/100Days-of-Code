public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0, right = nums.length - 1;

        // First, find the index of the smallest value using binary search.
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Now, 'left' is the index of the smallest value and also the number of rotations.
        int start = left;
        left = 0; 
        right = nums.length - 1;

        // Determine which part of the array to do binary search on.
        if (target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }

        // Binary search in the determined part of the array.
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Target not found.
        return -1;
    }
    public static void main(String[] args) {
        SearchInRotatedArray obj = new SearchInRotatedArray();
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(obj.search(arr, target));
    }
}