# Search Insert Position

## Problem Statement

Given a sorted array of distinct integers and a target value, the task is to return the index if the target is found. If the target is not found, return the index where it would be if it were inserted in order, ensuring that the algorithm operates with O(log n) runtime complexity.

### Examples

- **Example 1:**
  - Input: nums = [1,3,5,6], target = 5
  - Output: 2
- **Example 2:**
  - Input: nums = [1,3,5,6], target = 2
  - Output: 1
- **Example 3:**
  - Input: nums = [1,3,5,6], target = 7
  - Output: 4

## Approach and Solution

To find the target's insert position with an efficient time complexity, we use a binary search algorithm. The idea is to narrow down the search interval by half every time, making the algorithm's time complexity logarithmic.

### Step-by-Step Approach

1. **Initialize pointers:** Set `start` to 0 and `end` to `nums.length - 1`. These pointers represent the current search interval within the array.

2. **Binary Search Loop:**
   - Continue searching while `start` is less than or equal to `end`.
   - Calculate the middle index `mid` as `start + (end - start) / 2`.
   - **Check for target:**
     - If `nums[mid]` is equal to the target, return `mid` as the target's index.
     - If `nums[mid]` is greater than the target, move the `end` pointer to `mid - 1` to search the left half.
     - If `nums[mid]` is less than the target, move the `start` pointer to `mid + 1` to search the right half.

3. **Determine Insert Position:**
   - If the loop exits without returning, it means the target is not found. The correct insert position is pointed to by `start`, as `start` will have moved to the correct index where the target should be inserted to maintain order.

### Solution Code

```java
public int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) end = mid - 1;
        else start = mid + 1;
    }
    return start;
}
```

### Complexity Analysis

- **Time Complexity:** O(log n), where `n` is the number of elements in the input array. The binary search ensures that we reduce the search space by half in each step, leading to a logarithmic time complexity.
- **Space Complexity:** O(1). The solution uses a constant amount of space, as it modifies the pointers within the same input array without using extra space for data storage.
