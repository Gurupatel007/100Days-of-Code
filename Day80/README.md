# Find Peak Element

## Problem Statement

A peak element is defined as an element that is strictly greater than its neighbors. Given a 0-indexed integer array `nums`, your task is to find any peak element and return its index. It's guaranteed that `nums[-1] = nums[n] = -∞`, making any element on the boundary superior to an imaginary neighbor outside the array bounds. The algorithm you design must run in O(log n) time, making it a perfect scenario to apply binary search techniques.

## Examples

- **Example 1:**
  - Input: `nums = [1,2,3,1]`
  - Output: `2`
  - Explanation: The element at index 2 (value 3) is a peak element as it's greater than its neighbors. Your function should return the index number `2`.

- **Example 2:**
  - Input: `nums = [1,2,1,3,5,6,4]`
  - Output: `5`
  - Explanation: There are two peaks in the given array, at index 1 (value 2) and index 5 (value 6). Your function can return either index `1` or index `5`.

# Find Peak Element: Detailed Explanation

## Problem Statement

Given a 0-indexed integer array `nums`, your goal is to find a peak element and return its index. A peak element is strictly greater than its neighbors. Assume `nums[-1] = nums[n] = -∞`. The solution must achieve O(log n) runtime complexity.

## Algorithm

1. **Initialize Two Pointers:** Start with two pointers, `left = 0` and `right = nums.length - 1`. These pointers will help in applying binary search.

2. **Binary Search:** Use a while loop to continue searching as long as `left` is less than or equal to `right`.

    a. **Find the Midpoint:** Calculate the midpoint `mid` as `left + (right - left) / 2`.

    b. **Check Left Neighbor:** If `mid > 0` and `nums[mid]` is less than `nums[mid - 1]`, then a peak element must be to the left. Set `right = mid - 1`.

    c. **Check Right Neighbor:** Otherwise, if `mid < nums.length - 1` and `nums[mid]` is less than `nums[mid + 1]`, then a peak element must be to the right. Set `left = mid + 1`.
    
    d. **Found a Peak:** If `nums[mid]` is not less than either neighbor, it means `mid` is at a peak element. Return `mid`.

3. **Return -1 if No Peak Found:** If the loop exits without returning, it means no peak was found (which theoretically shouldn't happen given the problem's constraints). Return -1.

## Example Walkthrough

Consider `nums = [1, 2, 1, 3, 5, 6, 4]`.

1. `left = 0`, `right = 6`, `mid = 3`. `nums[3] < nums[4]`, so move right to `left = mid + 1`.

2. `left = 4`, `right = 6`, `mid = 5`. `nums[5] > nums[4]` and `nums[5] > nums[6]`, so `mid = 5` is a peak. Return `5`.

## Solution

```java
public int findPeakElement(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (mid > 0 && nums[mid] < nums[mid - 1]) {
            // If the left neighbor is greater, move left
            right = mid - 1;
        } else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
            // If the right neighbor is greater, move right
            left = mid + 1;
        } else {
            // Found a peak
            return mid;
        }
    }
    return -1;
}
```
## Time Complexity

The time complexity of this algorithm is **O(log n)** because it essentially performs a binary search, halving the search space with each iteration.

## Space Complexity

The space complexity is **O(1)** since the algorithm uses a constant amount of space regardless of the input size.