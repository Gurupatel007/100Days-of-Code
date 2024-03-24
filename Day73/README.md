# Two Sum II - Input Array Is Sorted

## Problem Statement

Given a 1-indexed array of integers `numbers` that is already sorted in non-decreasing order, your task is to find two numbers such that they add up to a specific target number. These two numbers should be identified by their positions in the array, `index1` and `index2`, where `1 <= index1 < index2 <= numbers.length`.

You are required to return the indices of these two numbers as an integer array `[index1, index2]` of length 2. The given constraints ensure that there is exactly one solution, and you may not use the same element twice. Additionally, your solution must utilize only constant extra space.

### Examples

- **Example 1:**
    - Input: `numbers = [2,7,11,15], target = 9`
    - Output: `[1,2]`
    - Explanation: The sum of 2 and 7 is 9. Thus, `index1 = 1`, `index2 = 2`. We return `[1, 2]`.

- **Example 2:**
    - Input: `numbers = [2,3,4], target = 6`
    - Output: `[1,3]`
    - Explanation: The sum of 2 and 4 is 6. Thus, `index1 = 1`, `index2 = 3`. We return `[1, 3]`.

- **Example 3:**
    - Input: `numbers = [-1,0], target = -1`
    - Output: `[1,2]`
    - Explanation: The sum of -1 and 0 is -1. Thus, `index1 = 1`, `index2 = 2`. We return `[1, 2]`.

## Approach

To solve this problem efficiently, we take advantage of the fact that the input array `numbers` is sorted in non-decreasing order. This allows us to use a modified binary search to find the complement of each element such that their sum equals the target.

1. Iterate through each element in the array.
2. For the current element, calculate its complement by subtracting it from the target.
3. Perform a binary search for the complement in the subarray to the right of the current element.
    - If the complement is found, return the current index and the found index as the solution, adjusting for the fact that the array is 1-indexed.
    - Adjust the search boundaries based on the comparison between the middle element and the complement.
4. If no solution is found after iterating through the array, return `[-1, -1]`.

### Code

```java
public int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
        int left = i + 1, right = numbers.length - 1, complement = target - numbers[i];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == complement) {
                return new int[]{i + 1, mid + 1}; // Adjusting for 1-indexed array
            } else if (numbers[mid] > complement) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
    return new int[]{-1, -1};
}
```
## Complexity Analysis

- **Time Complexity**: O(n log n), where n is the number of elements in the input array. For each element, a binary search is performed on the rest of the array.
- **Space Complexity**: O(1), as the solution uses a constant amount of space.
