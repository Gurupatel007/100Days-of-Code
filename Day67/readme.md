# 344. Reverse String

## Problem Statement
Write a function that reverses a string. The input string is given as an array of characters `s`. You must do this by modifying the input array in-place with O(1) extra memory.

### Examples

- **Example 1:**
  - Input: `s = ["h","e","l","l","o"]`
  - Output: `["o","l","l","e","h"]`
- **Example 2:**
  - Input: `s = ["H","a","n","n","a","h"]`
  - Output: `["h","a","n","n","a","H"]`

## Approach
To reverse the string in-place, we'll use two pointers approach. One pointer starts at the beginning (`left`) and another at the end (`right`) of the string. We swap the characters at these pointers and move the `left` pointer forward and the `right` pointer backward, until they meet or cross each other. This approach ensures that the reversal is done in-place, requiring no extra space except for a few temporary variables.

### Algorithm
1. Initialize two pointers, `left` at 0 and `right` at the length of the string minus 1.
2. While `left` is less than or equal to `right`:
   - Swap the characters at `left` and `right`.
   - Increment `left`.
   - Decrement `right`.
3. The string is reversed in-place.

### Code

```java
public void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;

    while (left <= right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        left++;
        right--;
    }
}
```