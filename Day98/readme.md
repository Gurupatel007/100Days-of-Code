# Valid Parentheses

## Problem Statement

Given a string `s` containing only parentheses, braces, and square brackets, determine if the input string is valid. A string is considered valid if every opening bracket has a corresponding closing bracket of the same type and they appear in the correct order.

## Examples

- **Example 1:**
  - Input: `s = "()"`
  - Output: `true`
  - Explanation: The string contains only one pair of parentheses, which are balanced and in the correct order.

- **Example 2:**
  - Input: `s = "()[]{}"`
  - Output: `true`
  - Explanation: The string contains multiple pairs of parentheses, all of which are balanced and in the correct order.

- **Example 3:**
  - Input: `s = "(]"`
  - Output: `false`
  - Explanation: The string contains an opening bracket followed by a closing bracket of a different type, violating the condition of having matching types for open and close brackets.

## Code Walkthrough

The solution uses a simple stack-based approach. It checks each character of the string and maintains a stack of opening brackets. If a closing bracket is encountered, it verifies if it corresponds to the last opening bracket on the stack. If not, the string is considered invalid. After processing all characters, if the stack is empty, the string is considered valid; otherwise, it is invalid.

## Implementation

### Description

The `isValid` function takes a string `s` as input and returns `true` if the string is valid according to the conditions mentioned above; otherwise, it returns `false`.

The function uses a stack to keep track of opening brackets encountered while iterating through the string. It iterates through each character of the string and performs the necessary checks as described above.

### Code

```java
public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
        } else {
            if (stack.isEmpty()) {
                return false;
            }
            char top = stack.pop();
            if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}
```

## Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input string `s`.
- **Space Complexity:** O(n), where n is the length of the input string `s`.