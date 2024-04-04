# Find Smallest Letter Greater Than Target

## Problem Statement

Given an array of characters `letters` sorted in non-decreasing order, and a character `target`, the task is to find the smallest character in `letters` that is lexicographically greater than `target`. If no such character exists (i.e., all characters in `letters` are less than or equal to `target`), return the first character in `letters`.

## Examples

- **Example 1:**
  - Input: `letters = ["c","f","j"]`, `target = "a"`
  - Output: `"c"`
  - Explanation: `'c'` is the smallest character that is greater than `'a'`.

- **Example 2:**
  - Input: `letters = ["c","f","j"]`, `target = "c"`
  - Output: `"f"`
  - Explanation: `'f'` is the smallest character that is greater than `'c'`.

- **Example 3:**
  - Input: `letters = ["x","x","y","y"]`, `target = "z"`
  - Output: `"x"`
  - Explanation: There's no character greater than `'z'`, so the first character `'x'` is returned.

## Solution

The solution uses a binary search approach to efficiently find the smallest character greater than the target. 

## Code Explanation

1. **Initialize Pointers:** Two pointers, `left` and `right`, are used to traverse the array. `left` starts at 0, and `right` starts at `letters.length - 1`.

2. **Binary Search:** A binary search loop is run while `left` is less than or equal to `right`. In each iteration, a middle index `mid` is calculated. The value at `mid` is compared with the `target`.
   - If `target` is less than `letters[mid]`, adjust `right` to `mid - 1`.
   - Otherwise, adjust `left` to `mid + 1` to continue searching in the right half.

3. **Find the Result:** After exiting the loop, `left` will point to the smallest element greater than `target`. If `left` is equal to `letters.length`, it means we've surpassed the array bounds, and we should return the first element of the array. This is handled by returning `letters[left % letters.length]`.

## Example Walkthrough

Consider `letters = ["c","f","j"]` and `target = "c"`.

1. The binary search starts with `left = 0` and `right = 2`.
2. In the first iteration, `mid = 1`, and since `letters[1] = 'f'` is greater than `target = 'c'`, we adjust `right` to `0`.
3. The loop exits because `left > right`, with `left = 1`.
4. The method returns `letters[1 % 3]`, which is `'f'`.

## Solution Code

```java
public char nextGreatestLetter(char[] letters, char target) {
    int left = 0;
    int right = letters.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (target < letters[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return letters[left % letters.length];
}
```

## Complexity Analysis

- **Time Complexity:** O(log n), where `n` is the length of `letters`. The binary search halves the search space with each iteration, leading to logarithmic time complexity.
- **Space Complexity:** O(1), as the solution uses a constant amount of extra space, regardless of the input size.