# Longest Substring Without Repeating Characters

## Problem Statement

Given a string `s`, find the length of the longest substring without repeating characters.

## Examples

- **Example 1:**
  - Input: `s = "abcabcbb"`
  - Output: `3`
  - Explanation: The longest substring without repeating characters is "abc" with a length of 3.

- **Example 2:**
  - Input: `s = "bbbbb"`
  - Output: `1`
  - Explanation: The longest substring without repeating characters is "b" with a length of 1.

- **Example 3:**
  - Input: `s = "pwwkew"`
  - Output: `3`
  - Explanation: The longest substring without repeating characters is "wke" with a length of 3. Notice that "pwke" is a subsequence and not a substring.

## Constraints

- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols, and spaces.

## Code Walkthrough

The solution involves using a sliding window approach with two pointers (`i` and `j`). We maintain a HashSet to store the characters in the current substring. We iterate through the string with the `j` pointer, expanding the window until we encounter a repeating character. Then, we move the `i` pointer to the right until the substring becomes valid again. We keep track of the maximum length encountered during this process.

### Code

```java
public int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int max = 0;
    int i = 0;
    int j = 0;
    
    while (j < s.length()) {
        char currEle = s.charAt(j);
        
        if (!set.contains(currEle)) {
            set.add(currEle);
            j++;
            max = Math.max(max, j - i);
        } else {
            set.remove(s.charAt(i));
            i++;
        }
    }
    return max;
}
```

## Time and Space Complexity

- **Time Complexity:** O(N), where N is the length of the string `s`. Both `i` and `j` traverse at most N steps.
- **Space Complexity:** O(min(N, M)), where N is the length of the string `s`, and M is the size of the character set (26 for English letters). The space used by the HashSet is bounded by the size of the character set.