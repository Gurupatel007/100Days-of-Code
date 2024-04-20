# Check if Array is Sorted

## Problem Statement

Given an array of integers `arr`, write a function to check if the array is sorted in non-decreasing order.

## Examples

- **Example 1:**
  - Input: `arr = [1, 2, 3, 4, 5]`
  - Output: `true`
  - Explanation: The array is sorted in non-decreasing order.

- **Example 2:**
  - Input: `arr = [1, 3, 2, 4, 5]`
  - Output: `false`
  - Explanation: The array is not sorted in non-decreasing order.

- **Example 3:**
  - Input: `arr = [5, 4, 3, 2, 1]`
  - Output: `false`
  - Explanation: The array is not sorted in non-decreasing order.

## Code Walkthrough

The solution provides a method `checkSorted` to check if an array is sorted in non-decreasing order using recursion.

The `checkSorted` method takes an array `arr` and an integer `i` as input. The integer `i` represents the current index being checked.

The method returns `true` if the array is sorted in non-decreasing order up to index `i`, and `false` otherwise.

The method uses recursion to compare the element at index `i` with the element at index `i+1`. If `arr[i]` is less than `arr[i+1]`, it recursively calls `checkSorted` with `i+1`. If `i` reaches the end of the array, the method returns `true`, indicating that the array is sorted.

## Implementation

### Description

The `checkSorted` function takes an array `arr` and an integer `i` as input and returns a boolean value indicating whether the array is sorted in non-decreasing order up to index `i`.

The method checks if the current element `arr[i]` is less than the next element `arr[i+1]`. If it is, it recursively calls itself with `i+1`. If `i` reaches the end of the array or if the current element is greater than or equal to the next element, the method returns `true`.

### Code

```java
public static boolean checkSorted(int[] arr, int i) {
    if (i == arr.length - 1) {
        return true;
    }
    return arr[i] <= arr[i + 1] && checkSorted(arr, i + 1);
}
```

## Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the array `arr`. The method checks each element of the array once.
- **Space Complexity:** O(n), where n is the length of the array `arr`. The method uses recursive calls, which can result in a call stack of depth `n`.