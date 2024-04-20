# Search in Rotated Sorted Array II

## Problem Statement

You are given an integer array `nums` sorted in non-decreasing order (not necessarily with distinct values). The array `nums` is rotated at an unknown pivot index `k` (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). Given the array `nums` after the rotation and an integer `target`, write a function to determine if `target` is present in `nums`. Return `true` if `target` is in `nums`, otherwise return `false`.

## Examples

- **Example 1:**
  - Input: `nums = [2,5,6,0,0,1,2]`, `target = 0`
  - Output: `true`
  - Explanation: The target 0 is present in the rotated sorted array [2,5,6,0,0,1,2].

- **Example 2:**
  - Input: `nums = [2,5,6,0,0,1,2]`, `target = 3`
  - Output: `false`
  - Explanation: The target 3 is not present in the rotated sorted array [2,5,6,0,0,1,2].

## Code Walkthrough

The code provides a function `search1` to perform a binary search in a rotated sorted array:
- It takes four parameters: the integer array `arr`, the target integer `target`, and the start and end indices `start` and `end` to define the search range.
- The function implements a modified binary search algorithm to handle rotation in the array.
- It checks if the current range is sorted and then determines whether the target lies within that range or not. Depending on the result, it recursively searches in either the left or right half of the array.

## Implementation

### Description

The `search1` function searches for the target integer in a rotated sorted array.
- It returns `true` if the target integer is found, otherwise `false`.

### Code

```java
static boolean search1(int[] arr, int target, int start, int end) {
    if (start > end)
        return false;
    int mid = start + (end - start) / 2;
    if (arr[mid] == target)
        return true;
    if (arr[start] < arr[mid]) {
        if (target >= arr[start] && target < arr[mid])
            return search1(arr, target, start, mid - 1);
        else
            return search1(arr, target, mid + 1, end);
    } else if (arr[start] > arr[mid]) {
        if (target > arr[mid] && target <= arr[end])
            return search1(arr, target, mid + 1, end);
        else
            return search1(arr, target, start, mid - 1);
    } else {
        return search1(arr, target, start, mid - 1) || search1(arr, target, mid + 1, end);
    }
}
```

## Time and Space Complexity

- **Time Complexity:** O(log n), where n is the length of the array `arr`. The function performs binary search, reducing the search range by half in each recursive call.
- **Space Complexity:** O(log n), where n is the length of the array `arr`. The space complexity arises due to the recursive calls and the function call stack during recursion.