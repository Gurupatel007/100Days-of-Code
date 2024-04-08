# First Unique Character in a String

## Problem Statement

Given a string `s`, find the first non-repeating character in it and return its index. If it does not exist, return -1.

## Examples

- **Example 1:**
  - Input: `s = "leetcode"`
  - Output: `0`
  - Explanation: The first non-repeating character is 'l' at index 0.

- **Example 2:**
  - Input: `s = "loveleetcode"`
  - Output: `2`
  - Explanation: The first non-repeating character is 'v' at index 2.

- **Example 3:**
  - Input: `s = "aabb"`
  - Output: `-1`
  - Explanation: There is no non-repeating character in the string.

## Code Walkthrough

The solution involves using a HashMap to count the occurrences of each character in the string. By iterating through the string twice:
- First, build a map with each character's count.
- Then, iterate through the string again to find the first character that appears exactly once according to the map and return its index.

## Visualization

For `s = "loveleetcode"`:
- The hashmap after the first iteration would look like: `{l: 2, o: 2, v: 1, e: 4, t: 1, c: 1, d: 1}`
- The second iteration checks each character by index:
  - 'l' (index 0) appears twice.
  - 'o' (index 1) appears twice.
  - 'v' (index 2) appears once, so its index (2) is returned.

## Implementation

The implementation leverages a `HashMap` to track the frequency of each character in the string. We then iterate over the string to identify the first character that appears exactly once.

### Code

```java
public int firstUniqChar(String s) {
    HashMap<Character, Integer> hashmap = new HashMap<>();
    
    // Count the occurrences of each character
    for (char ch : s.toCharArray()) {
        hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
    }
    
    // Find the index of the first unique character
    for (int i = 0; i < s.length(); i++) {
        if (hashmap.get(s.charAt(i)) == 1) {
            return i;
        }
    }
    return -1;
}
```

## Time and Space Complexity

- **Time Complexity:** O(n) - The algorithm iterates over the string twice, where n is the length of the string, leading to a linear time complexity.
- **Space Complexity:** O(1) - The space complexity is constant because the input string only contains lowercase English letters, and thus the hashmap can contain at most 26 key-value pairs.