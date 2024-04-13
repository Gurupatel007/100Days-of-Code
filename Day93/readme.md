# Removing Stars From a String

## Problem Statement

You are given a string `s`, which contains stars '*'. In one operation, you can:

- Choose a star in `s`.
- Remove the closest non-star character to its left, as well as remove the star itself.

Return the string after all stars have been removed.

**Note:**
- The input will be generated such that the operation is always possible.
- It can be shown that the resulting string will always be unique.

## Examples

- **Example 1:**
  - Input: `s = "leet**cod*e"`
  - Output: `"lecoe"`
  - Explanation: Performing the removals from left to right:
    - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
    - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
    - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
  - There are no more stars, so we return "lecoe".

- **Example 2:**
  - Input: `s = "erase*****"`
  - Output: `""`
  - Explanation: The entire string is removed, so we return an empty string.

## Constraints

- `1 <= s.length <= 10^5`
- `s` consists of lowercase English letters and stars '*'.
- The operation above can be performed on `s`.

## Code Walkthrough

The solution involves iterating over each character in the string. If the character is a '*', we remove the closest non-star character to its left along with the '*' itself. If the character is not a '*', we append it to the result. Finally, we convert the StringBuilder to String and return.

## Implementation

### Description

In this implementation, we iterate over each character in the string. If the character is a '*', we remove the last character if the result is not empty. Otherwise, we append the current character to the result. Finally, we convert the StringBuilder to String and return.

### Code

```java
public String removeStars(String s) {
    StringBuilder result = new StringBuilder();

    // Iterate over each character in the string
    for (char ch : s.toCharArray()) {
        if (ch == '*') {
            // Remove the last character if there's a '*' and the result is not empty
            if (result.length() > 0) {
                result.setLength(result.length() - 1);
            }
        } else {
            // Add the current character to the result if it's not '*'
            result.append(ch);
        }
    }

    // Convert StringBuilder to String and return
    return result.toString();
}
```

## Step-by-Step Visualization

### Process Each Character:

- **a:** Append 'a' to result.
  - Result now contains: "a"
- **b:** Append 'b' to result.
  - Result now contains: "ab"
- **\*:** '*' found, remove the last character ('b').
  - Result now contains: "a"
- **c:** Append 'c' to result.
  - Result now contains: "ac"
- **\*:** '*' found, remove the last character ('c').
  - Result now contains: "a"
- **d:** Append 'd' to result.
  - Result now contains: "ad"
- **e:** Append 'e' to result.
  - Result now contains: "ade"
- **\*:** '*' found, remove the last character ('e').
  - Result now contains: "ad"
- **\*:** '*' found again, remove the last character ('d').
  - Result now contains: "a"
- **f:** Append 'f' to result.
  - Result now contains: "af"

## Time and Space Complexity

- **Time Complexity:** O(N), where N is the length of the input string `s`. We iterate through each character once.
- **Space Complexity:** O(N), the space used by the StringBuilder to store the result. In the worst case, the result string is of length N.