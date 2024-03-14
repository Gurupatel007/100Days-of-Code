# Largest Odd Number in String

## Problem Statement
Given a string `num`, representing a large integer, your task is to return the largest-valued odd integer (as a string) that is a non-empty substring of `num`. If no odd integer exists as a substring, return an empty string `""`.

A substring is defined as a contiguous sequence of characters within a string.

## Examples

**Example 1:**
- Input: `num = "52"`
- Output: `"5"`
- Explanation: The non-empty substrings are "5", "2", and "52". "5" is the only odd number, making it the largest odd number substring.

**Example 2:**
- Input: `num = "4206"`
- Output: `""`
- Explanation: There are no odd numbers in "4206", so the output is an empty string.

**Example 3:**
- Input: `num = "35427"`
- Output: `"35427"`
- Explanation: "35427" is already an odd number and it's the largest odd number substring of itself.

## Approach
To find the largest odd number substring, we inspect the given string `num` from its end towards the beginning because the largest valued odd integer would be the one that includes as much of the beginning of `num` as possible while still being odd.

### Steps:
1. Iterate through the string `num` from its last character to the first.
2. Check if the current character represents an odd digit by verifying if `(num.charAt(i) - '0') % 2 != 0`.
    - If the current character is odd, that means the substring from the beginning of `num` to this character (inclusive) is the largest odd number substring. Return this substring.
3. If the iteration completes without finding any odd digit, return an empty string `""` indicating no such substring exists.

### Code
```java
public String largestOddNumber(String num) {
    for (int i = num.length() - 1; i >= 0; i--) {
        // Check if the current character is an odd digit
        if ((num.charAt(i) - '0') % 2 != 0) {
            // If it's odd, return the substring from the beginning to this digit (inclusive)
            return num.substring(0, i + 1);
        }
    }
    // If no odd digit is found, return an empty string
    return "";
}
