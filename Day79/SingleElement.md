# Single Element in a Sorted Array

## Problem Statement

Given a sorted array where every element appears exactly twice except for one element that appears only once, the task is to find and return the single element that does not repeat.

### Constraints

- The solution must run in O(log n) time complexity.
- The space complexity should be O(1).

### Example Inputs & Outputs

- **Example 1:**
  - Input: nums = [1,1,2,3,3,4,4,8,8]
  - Output: 2
- **Example 2:**
  - Input: nums = [3,3,7,7,10,11,11]
  - Output: 10

## Approach

The problem is solved using a binary search algorithm. The key insight is to leverage the property that every element appears exactly twice, except for one. This affects how pairs are aligned with respect to the middle index during the binary search.

### Algorithm

1. Initialize `start` as 0 and `end` as the last index of `nums`.
2. Perform binary search while `start < end`:
   - Calculate the middle index `mid`.
   - Determine if `mid` is even or odd.
   - Based on the parity of `mid`, check adjacent elements to decide whether the single element lies to the left or right of `mid`.
3. Once the start and end pointers converge, `start` (or `end`) will point to the single element.

### Solution Code

```java
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
```

### Complexity Analysis

- **Time Complexity:** O(log n), thanks to the binary search approach.
- **Space Complexity:** O(1), as no extra space is used apart from a few variables.