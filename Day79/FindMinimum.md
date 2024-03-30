# Find Minimum in Rotated Sorted Array

## Problem Statement

Given a rotated sorted array of unique elements, the task is to find the minimum element. The array has been rotated between 1 and n times. The algorithm should run in O(log n) time complexity.

### Constraints

- The array may contain any number of rotations.
- All elements in the array are unique.
- The solution must achieve O(log n) time complexity.

### Example Inputs & Outputs

- **Example 1:**
  - Input: nums = [3,4,5,1,2]
  - Output: 1
- **Example 2:**
  - Input: nums = [4,5,6,7,0,1,2]
  - Output: 0
- **Example 3:**
  - Input: nums = [11,13,15,17]
  - Output: 11

## Approach

The problem is addressed using a modified binary search algorithm, taking advantage of the sorted and rotated nature of the array.

### Algorithm

1. Initialize `left` as 0 and `right` as the last index of `nums`.
2. Use binary search to locate the pivot point (the smallest element, which is the minimum in the rotated sorted array):
   - If `nums[mid] > nums[right]`, the pivot is to the right of `mid`, so adjust `left` to `mid + 1`.
   - Otherwise, adjust `right` to `mid`.
3. The search ends when `left == right`, pointing to the smallest (minimum) element.

### Solution Code

```java
public int findMin(int[] nums) {
    if (nums == null || nums.length == 0) {
        return -1;
    }
    int left = 0, right = nums.length - 1;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] > nums[right]) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return nums[left];
}
```

### Complexity Analysis

- **Time Complexity:** O(log n), due to the binary search method.
- **Space Complexity:** O(1), as the solution only utilizes a few variables for its operations.