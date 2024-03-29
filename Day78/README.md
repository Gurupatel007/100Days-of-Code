# Search in Rotated Sorted Array

## Problem Statement

Given an integer array `nums` sorted in ascending order with distinct values, the array is potentially rotated at an unknown pivot index `k` (1 <= k < nums.length). The task is to find the index of a given target in the rotated array using an algorithm with O(log n) runtime complexity. If the target is not present in the array, return -1.

### Examples

- **Example 1:**
  - Input: nums = [4,5,6,7,0,1,2], target = 0
  - Output: 4
- **Example 2:**
  - Input: nums = [4,5,6,7,0,1,2], target = 3
  - Output: -1
- **Example 3:**
  - Input: nums = [1], target = 0
  - Output: -1

## Approach and Solution

The solution involves two main steps:
1. **Identify the Pivot (Smallest Element):** Using binary search, find the index of the smallest element. This index also represents the number of rotations applied to the originally sorted array.
2. **Search for the Target:** Determine in which portion of the rotated array (to the left or to the right of the pivot) the target potentially lies, and perform a standard binary search in that portion.

### Step-by-Step Approach

1. **Find the Pivot:**
   - Initialize two pointers, `left` and `right`, at the start and end of the array, respectively.
   - Perform a binary search to find the pivot where the array is rotated. The pivot is the point where the next element is less than the current element.
   - Adjust `left` and `right` pointers based on the comparison between the middle element and the right-most element to find the pivot.

2. **Binary Search for Target:**
   - Reset `left` to 0 and `right` to the array's length minus one.
   - Determine whether to search in the left or right portion of the array by comparing the target with the array's values at the pivot and at the right pointer.
   - Perform a binary search in the determined portion of the array.

### Solution Code

```java
public int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
        return -1;
    }

    int left = 0, right = nums.length - 1;

    // Find the index of the smallest value.
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] > nums[right]) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    // Now, 'left' is the pivot.
    int start = left;
    left = 0;
    right = nums.length - 1;

    // Determine the search range.
    if (target >= nums[start] && target <= nums[right]) {
        left = start;
    } else {
        right = start;
    }

    // Binary search.
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
```

### Complexity Analysis

- **Time Complexity:** O(log n), as the algorithm performs binary search twice, each taking logarithmic time.
- **Space Complexity:** O(1), since the space used does not depend on the input array size.