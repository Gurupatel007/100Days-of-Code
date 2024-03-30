package Day79;

public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;
        // Binary search.
        while (start < end) {
            // Find the middle index.
            int mid = start + (end - start) / 2;
            
            // Check if the middle is even or odd to decide the search space.
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    // If mid is even and nums[mid] == nums[mid + 1],
                    // the single element is in the right half.
                    start = mid + 2;
                } else {
                    // Else, it's in the left half.
                    end = mid;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    // If mid is odd and nums[mid] == nums[mid - 1],
                    // the single element is in the right half.
                    start = mid + 1;
                } else {
                    // Else, it's in the left half.
                    end = mid;
                }
            }
        }
        // When start == end, we have found the single element.
        return nums[start];
    }
    public static void main(String[] args) {
        SingleElement obj = new SingleElement();
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(obj.singleNonDuplicate(nums));
    }
}