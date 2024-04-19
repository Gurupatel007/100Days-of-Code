# Number of Steps to Reduce a Number to Zero

## Problem Statement

Given an integer `num`, return the number of steps required to reduce it to zero. In each step, if the current number is even, it should be divided by 2; otherwise, it should be subtracted by 1.

## Examples

- **Example 1:**
  - Input: `num = 14`
  - Output: `6`
  - Explanation: 
    - Step 1) 14 is even; divide by 2 and obtain 7. 
    - Step 2) 7 is odd; subtract 1 and obtain 6.
    - Step 3) 6 is even; divide by 2 and obtain 3. 
    - Step 4) 3 is odd; subtract 1 and obtain 2. 
    - Step 5) 2 is even; divide by 2 and obtain 1. 
    - Step 6) 1 is odd; subtract 1 and obtain 0.

- **Example 2:**
  - Input: `num = 8`
  - Output: `4`
  - Explanation: 
    - Step 1) 8 is even; divide by 2 and obtain 4. 
    - Step 2) 4 is even; divide by 2 and obtain 2. 
    - Step 3) 2 is even; divide by 2 and obtain 1. 
    - Step 4) 1 is odd; subtract 1 and obtain 0.

- **Example 3:**
  - Input: `num = 123`
  - Output: `12`

## Code Walkthrough

The solution provides a method `numberOfSteps` to calculate the number of steps required to reduce a number to zero. It uses a helper method `helper` to perform the actual calculation recursively.

The `helper` method takes two parameters: `digit`, which represents the current number, and `c`, which represents the current count of steps. It recursively calculates the number of steps required by following the rules mentioned in the problem statement.

## Implementation

### Description

The `numberOfSteps` function takes an integer `num` as input and returns the number of steps required to reduce it to zero.

The function internally calls the `helper` method with the initial count `c` set to 0.

The `helper` method recursively reduces the number `digit` to zero while keeping track of the count of steps performed.

The time complexity of the solution is O(log n), where n is the value of the input number `num`. This is because the number of steps is proportional to the number of bits required to represent the number.

The space complexity is O(log n) as well, due to the recursive calls made to the `helper` method.

### Code

```java
public int numberOfSteps(int num) {
    return helper(num, 0);
}

private static int helper(int digit, int c) {
    if (digit == 0) return c;
    if (digit % 2 == 0) {
        return helper(digit / 2, c + 1);
    }
    return helper(digit - 1, c + 1);
}
```

## Time and Space Complexity

- **Time Complexity:** O(log n), where n is the value of the input number `num`.
- **Space Complexity:** O(log n), where n is the value of the input number `num`.