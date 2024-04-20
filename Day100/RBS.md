# Binary Search in Rotated Sorted Array

## Problem Statement

Given a rotated sorted array `arr` of integers and a target integer `target`, write a function to search for the target in the array. If the target exists in the array, return its index; otherwise, return -1.

The array is rotated at some unknown pivot and sorted in ascending order.

## Code Walkthrough

This code provides a function `search` to perform binary search on a rotated sorted array:
- The function takes four parameters: the integer array `arr`, the target integer `target`, and the start and end indices `s` and `e` to define the search range.
- It implements a modified binary search algorithm to handle the rotation in the array.
- The algorithm first checks if the current range is sorted and then determines whether the target lies within that range or not. Depending on the result, it recursively searches in either the left or right half of the array.

## Implementation

### Description

The `search` function searches for the target integer in a rotated sorted array.
- It returns the index of the target integer if found, otherwise -1.

### Code

```java
static int search(int[] arr, int target, int start, int end) {
    // If start index is greater than end index, the target is not found
    if (start > end) 
        return -1;
    
    // Calculate the middle index
    int mid = start + (end - start) / 2;
    
    // If the middle element is the target, return its index
    if (arr[mid] == target) 
        return mid;
    
    // Check if the current range is sorted
    if (arr[start] <= arr[mid]) {
        // If the target is within the sorted range, search in that half
        if (target >= arr[start] && target <= arr[mid]) 
            return search(arr, target, start, mid - 1);
        // If the target is not within the sorted range, search in the other half
        else 
            return search(arr, target, mid + 1, end);
    }
    // If the current range is not sorted, search in the other half
    else {
        // If the target is within the other half range, search in that half
        if (target >= arr[mid] && target <= arr[end]) 
            return search(arr, target, mid + 1, end);
        // If the target is not within the other half range, search in the sorted half
        else 
            return search(arr, target, start, mid - 1);
    }
}
```

## Time and Space Complexity

- **Time Complexity:** O(log n), where n is the length of the array `arr`. The function performs binary search, reducing the search range by half in each recursive call.
- **Space Complexity:** O(log n), where n is the length of the array `arr`. The space complexity arises due to the recursive calls and the function call stack during recursion.