# Reverse Words in a String

## Problem Statement
Given an input string `s`, the task is to reverse the order of the words. A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space. The challenge is to return a string of the words in reverse order concatenated by a single space, while also handling potential leading or trailing spaces and multiple spaces between words in the input string.

## Examples

**Example 1:**
- Input: `s = "the sky is blue"`
- Output: `"blue is sky the"`

**Example 2:**
- Input: `s = "  hello world  "`
- Output: `"world hello"`
- Explanation: The reversed string should not contain leading or trailing spaces.

**Example 3:**
- Input: `s = "a good   example"`
- Output: `"example good a"`
- Explanation: Multiple spaces between two words should be reduced to a single space in the reversed string.

## Approach
To reverse the words in the string while properly handling spaces, we follow these steps:

1. **Trim and Split:** First, trim the input string to remove any leading or trailing spaces. Then, split the trimmed string by one or more spaces (using the regex `\\s+`) to get an array of words.
2. **Reverse:** Initialize a `StringBuilder` to build the reversed string. Iterate through the array of words in reverse order, appending each word to the `StringBuilder`. Add a space between words, but ensure that no additional space is added after the last word.
3. **Result:** Convert the `StringBuilder` to a `String` and return it as the final reversed string.

### Code
```java
public String reverseWords(String s) {
    String[] words = s.trim().split("\\s+"); // Trim and split the input string

    // Reverse the order of words
    StringBuilder reversed = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
        reversed.append(words[i]);
        if (i > 0) {
            reversed.append(" "); // Add space between words, but not after the last word
        }
    }

    return reversed.toString();
}
