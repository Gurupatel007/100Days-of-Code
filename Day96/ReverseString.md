# Reverse String

## Problem Statement

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with O(1) extra memory.

## Examples

- **Example 1:**
  - Input: `s = ["h","e","l","l","o"]`
  - Output: `["o","l","l","e","h"]`

- **Example 2:**
  - Input: `s = ["H","a","n","n","a","h"]`
  - Output: `["h","a","n","n","a","H"]`

## Constraints

- `1 <= s.length <= 10^5`
- `s[i]` is a printable ASCII character.

## Code Walkthrough

The solution reverses the string by recursively swapping characters from the start and end of the array. It starts with two pointers, `l` at the beginning and `r` at the end of the array. These pointers move towards each other, swapping characters until they meet in the middle. This approach modifies the input array in-place without using extra memory.

## Implementation

### Description

The function `reverseString` takes an array of characters `s` as input and calls the recursive helper function `reverse` with the start index `l` set to 0 and the end index `r` set to `s.length-1`.

### Code

```java
public void reverseString(char[] s) {
    int l = 0;
    int r = s.length - 1;
    reverse(s, l, r);
}

static void reverse(char[] s, int l, int r) {
    if (l > r) return;
    char temp = s[l];
    s[l] = s[r];
    s[r] = temp;
    reverse(s, l + 1, r - 1);
}
```

## Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array `s`. The algorithm swaps characters until it reaches the middle of the array.
- **Space Complexity:** O(1), as the algorithm modifies the input array in-place without using extra memory.