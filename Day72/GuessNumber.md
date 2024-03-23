# Guess Number Higher or Lower

## Problem Statement

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked. Every time you guess wrong, I'll tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns three possible results:

- -1: Your guess is higher than the number I picked (`num > pick`).
- 1: Your guess is lower than the number I picked (`num < pick`).
- 0: your guess is equal to the number I picked (`num == pick`).

Return the number that I picked.

## Examples

### Example 1:
- Input: n = 10, pick = 6
- Output: 6

### Example 2:
- Input: n = 1, pick = 1
- Output: 1

### Example 3:
- Input: n = 2, pick = 1
- Output: 1

## Approach

### Binary Search

This approach also utilizes the binary search algorithm to efficiently find the correct number.

- Initialize two pointers, `min = 1` and `max = n`.
- Use a while loop to continually divide the search space in half until the correct number is found.
- Calculate the midpoint `mid` between `min` and `max`.
- Use the `guess(mid)` API to check if `mid` is the correct guess.
  - If `guess(mid)` returns greater than 0, the target number is higher than `mid`, so update `min` to `mid + 1`.
  - If `guess(mid)` returns less than 0, the target number is lower than `mid`, so update `max` to `mid - 1`.
  - If `guess(mid)` returns 0, then `mid` is the correct number.

## Code

```java
public int guessNumber(int n) {
    int min = 1;
    int max = n;
    while(true) {
        int mid = min + (max - min) / 2;
        int result = guess(mid);
        if (result > 0) {
            min = mid + 1;
        } else if (result < 0) {
            max = mid - 1;
        } else {
            return mid;
        }
    }
}
```
## Complexity Analysis

- **Time Complexity**: O(log n), where n is the highest number. The binary search reduces the problem space by half each iteration.
- **Space Complexity**: O(1), as the solution uses a fixed amount of space.