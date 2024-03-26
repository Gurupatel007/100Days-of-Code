# Kth Missing Positive Number

## Problem Statement

Given an array `arr` of positive integers sorted in a strictly increasing order, and an integer `k`, the goal is to return the `k`th missing positive integer from this array.

### Examples

- **Example 1:**
  - Input: arr = [2,3,4,7,11], k = 5
  - Output: 9
  - Explanation: The sequence of missing positive integers is [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

- **Example 2:**
  - Input: arr = [1,2,3,4], k = 2
  - Output: 6
  - Explanation: The sequence of missing positive integers is [5,6,7,...]. The 2nd missing positive integer is 6.

## Approach and Solution

To find the `k`th missing positive number efficiently, we use a binary search algorithm. This method helps us to minimize the search space by comparing the number of missing numbers at the middle index of our search space with `k`.

### Step-by-Step Approach

1. **Initialize two pointers:** Set `left` to 0 and `right` to the length of the array. These pointers represent the bounds of our search space.

2. **Binary Search Loop:**
   - While `left` is less than `right`, we continue the search.
   - Calculate the middle index `mid` as `left + (right - left) / 2`.
   - Calculate the number of missing elements up to index `mid` as `arr[mid] - (mid + 1)`. This is because if there were no missing numbers, the value at `arr[mid]` should be `mid + 1`.
   - **Decision Making:**
     - If the number of missing elements is less than `k`, it means the `k`th missing number is to the right of `mid`. Therefore, we update `left` to `mid + 1`.
     - Otherwise, the `k`th missing number is to the left of `mid` or at `mid`, and we update `right` to `mid`.

3. **Calculate the `k`th Missing Number:**
   - After exiting the loop, `left` will point to the smallest index where the number of missing numbers is at least `k`. The actual `k`th missing number is then `left + k`.

### Solution Code

```java
public int findKthPositive(int[] arr, int k) {
    int left = 0, right = arr.length;
    while (left < right) {
        int mid = left + (right - left) / 2;
        int missing = arr[mid] - (mid + 1);
        if (missing < k) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left + k;
}
```

### Complexity Analysis

- **Time Complexity:** O(log n), where `n` is the length of the input array. The binary search algorithm ensures that we split the search space in half with each iteration, leading to a logarithmic time complexity.
- **Space Complexity:** O(1). The solution uses a constant amount of extra space.