# Binary Search

## Problem Statement

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If `target` exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

## Examples

- **Example 1:**
  - Input: `nums = [-1,0,3,5,9,12]`, `target = 9`
  - Output: `4`
  - Explanation: 9 exists in `nums` and its index is 4.
  
- **Example 2:**
  - Input: `nums = [-1,0,3,5,9,12]`, `target = 2`
  - Output: `-1`
  - Explanation: 2 does not exist in `nums` so return -1.

## Constraints

- `1 <= nums.length <= 10^4`
- `-10^4 < nums[i], target < 10^4`
- All the integers in `nums` are unique.
- `nums` is sorted in ascending order.

## Code Walkthrough

The solution implements the binary search algorithm recursively. It divides the search interval in half and compares the target value with the middle element of the array. If the target value matches the middle element, its index is returned. If the target is less than the middle element, the search is performed in the lower half of the array. Otherwise, the search is performed in the upper half.

## Implementation

### Description

The binary search function `binarySearch` takes the array `arr`, the `target`, and the start and end indices `s` and `e`. It returns the index of the target element if found, otherwise -1.

### Code

```java
static int binarySearch(int[] arr, int target, int s, int e) {
    if (s > e) return -1;
    int m = s + (e - s) / 2;
    if (arr[m] == target) {
        return m;
    } else if (arr[m] < target) {
        return binarySearch(arr, target, m + 1, e);
    } else {
        return binarySearch(arr, target, s, m - 1);
    }
}
```

## Time and Space Complexity

- **Time Complexity:** O(log n), where n is the size of the input array `nums`. Binary search divides the search interval in half with each step.
- **Space Complexity:** O(log n), due to the recursive calls to the binary search function, which could potentially create a logarithmic call stack.