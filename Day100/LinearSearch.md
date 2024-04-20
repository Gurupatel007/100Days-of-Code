# Search Functions for Integer Arrays

## Functions Overview

This code provides multiple functions for searching elements in an integer array:

1. **search:** 
    - This function takes an integer array `arr`, a target integer `target`, and an index `index` as input parameters.
    - It recursively searches for the target integer in the array starting from the given index.
    - If the target integer is found, it returns `true`; otherwise, it returns `false`.
    
2. **findindex:**
    - This function takes an integer array `arr`, a target integer `target`, and an index `index` as input parameters.
    - It recursively searches for the first occurrence of the target integer in the array starting from the given index.
    - If the target integer is found, it returns the index of the first occurrence; otherwise, it returns `-1`.

3. **findAllIndex:**
    - This function takes an integer array `arr`, a target integer `target`, an index `index`, and an `ArrayList<Integer>` `ls` as input parameters.
    - It recursively searches for all occurrences of the target integer in the array starting from the given index.
    - It adds the index of each occurrence to the provided `ArrayList<Integer> ls` and returns the updated list.

4. **findAllIndexes:**
    - This function takes an integer array `arr`, a target integer `target`, and an index `index` as input parameters.
    - It recursively searches for all occurrences of the target integer in the array starting from the given index.
    - It returns an `ArrayList<Integer>` containing the indices of all occurrences of the target integer in the array.

## Code Walkthrough

The code provides several recursive functions to search for elements in an integer array:
- The `search` function searches for a single occurrence of the target integer.
- The `findindex` function searches for the index of the first occurrence of the target integer.
- The `findAllIndex` function searches for all occurrences of the target integer and stores their indices in an `ArrayList`.
- The `findAllIndexes` function is similar to `findAllIndex` but uses an additional helper function to concatenate the results from recursive calls.

## Implementation

### Description

Each function takes an integer array `arr`, a target integer `target`, and an index `index` as input parameters.
- The `search` and `findindex` functions return a single integer value.
- The `findAllIndex` and `findAllIndexes` functions return an `ArrayList<Integer>` containing the indices of all occurrences of the target integer.

### Code

```java
static boolean search(int[] arr, int target, int index) {
    if (index == arr.length) {
        return false;
    }
    return arr[index] == target || search(arr, target, index + 1);
}

static int findindex(int[] arr, int target, int index) {
    if (index == arr.length) {
        return -1;
    }
    if (arr[index] == target) {
        return index;
    } else {
        return findindex(arr, target, index + 1);
    }
}

static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> ls) {
    if (index == arr.length) {
        return ls;
    }
    if (arr[index] == target) {
        ls.add(index);
    }
    return findAllIndex(arr, target, index + 1, ls);
}

static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index) {
    ArrayList<Integer> ls = new ArrayList<>();
    if (index == arr.length) return ls;
    if (arr[index] == target) {
        ls.add(index);
    }
    ArrayList<Integer> ansFromBelowCalls = findAllIndexes(arr, target, index + 1);
    ls.addAll(ansFromBelowCalls);
    return ls;
}
```

## Time and Space Complexity

- **Time Complexity:** 
  - All functions have a time complexity of O(n), where n is the length of the array `arr`. 
  - The time complexity arises due to the recursive calls that potentially iterate through all elements of the array.
- **Space Complexity:** 
  - The space complexity for each function is O(n), where n is the length of the array `arr`. 
  - This space is used for the function call stack during recursion, as well as for storing the result in the case of `findAllIndex` and `findAllIndexes`.