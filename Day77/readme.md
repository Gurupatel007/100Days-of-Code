# Find First and Last Position of Element in Sorted Array

## Problem Statement

Given an array of integers `nums` sorted in non-decreasing order, the goal is to find the starting and ending position of a given target value. If the target is not found in the array, the function should return `[-1, -1]`. The algorithm must achieve O(log n) runtime complexity.

### Examples

- **Example 1:**
  - Input: nums = [5,7,7,8,8,10], target = 8
  - Output: [3,4]
- **Example 2:**
  - Input: nums = [5,7,7,8,8,10], target = 6
  - Output: [-1,-1]
- **Example 3:**
  - Input: nums = [], target = 0
  - Output: [-1,-1]

## Approach and Solution

The solution involves performing two binary searches: one to find the first occurrence of the target and another to find the last occurrence. This approach leverages the sorted nature of the array to achieve logarithmic time complexity.

### Step-by-Step Approach

1. **Find First Occurrence:**
   - Perform a binary search to find the first index where the target appears. If the current element is greater than or equal to the target, move the end pointer to narrow the search range. Update the index when the target is found to ensure the lowest possible index is recorded.

2. **Find Last Occurrence:**
   - Perform a second binary search to find the last index where the target appears. This time, if the current element is less than or equal to the target, move the start pointer to narrow the search range. Update the index when the target is found to ensure the highest possible index is recorded.

### Solution Code

```java
public int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    result[0] = findFirst(nums, target);
    result[1] = findLast(nums, target);
    return result;
}

private int findFirst(int[] nums, int target){
    int index = -1;
    int start = 0;
    int end = nums.length - 1;
    
    while(start <= end){
        int mid = start + (end - start) / 2;
        if(nums[mid] >= target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
        if(nums[mid] == target) index = mid;
    }
    
    return index;
}

private int findLast(int[] nums, int target){
    int index = -1;
    int start = 0;
    int end = nums.length - 1;
    
    while(start <= end){
        int mid = start + (end - start) / 2;
        if(nums[mid] <= target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
        if(nums[mid] == target) index = mid;
    }
    
    return index;
}
```

### Complexity Analysis

- **Time Complexity:** O(log n) for each binary search, resulting in O(log n) overall since the searches are performed sequentially and not nested.
- **Space Complexity:** O(1), as the solution uses a fixed amount of space for the index variables and the result array, irrespective of the input size.