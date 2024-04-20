## Check if Array is Sorted

**Problem Statement:**

Given an array of integers `arr`, write a function to check if the array is sorted in non-decreasing order.

[Link to the solution](ArraySortedOrNot.md)

---

## Search Functions for Integer Arrays

**Search Function for Integer Arrays**

**Function Name:** `search`
Implement a function `search` to recursively search for a target integer in an array.

**Find Index Function for Integer Arrays**

**Function Name:** `findindex`

Implement a function `findindex` to recursively find the index of the first occurrence of a target integer in an array.

**Find All Indexes Function for Integer Arrays**

**Function Name:** `findAllIndexes`

Implement a function `findAllIndexes` to recursively find all occurrences of a target integer in an array.

[Link to the solution](LinearSearch.md)

---

## Binary Search in Rotated Sorted Array

**Problem Statement:**

Given a rotated sorted array `arr` of integers and a target integer `target`, write a function to search for the target in the array. If the target exists in the array, return its index; otherwise, return -1.

The array is rotated at some unknown pivot and sorted in ascending order.

[Link to the solution](RBS.md)

---
## Search in Rotated Sorted Array II

**Problem Statement:**

There is an integer array `nums` sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, `nums` is rotated at an unknown pivot index `k` (0 <= k < nums.length) such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (0-indexed). For example, `[0,1,2,4,4,4,5,6,6,7]` might be rotated at pivot index 5 and become `[4,5,6,6,7,0,1,2,4,4]`.

Given the array `nums` after the rotation and an integer `target`, return `true` if `target` is in `nums`, or `false` if it is not in `nums`.

You must decrease the overall operation steps as much as possible.

**Example:**

```plaintext
Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true

Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
```

**Constraints:**

- 1 <= nums.length <= 5000
- -10^4 <= nums[i] <= 10^4
- nums is guaranteed to be rotated at some pivot.
- -10^4 <= target <= 10^4

[Link to the solution](SearchInSorted2.md)