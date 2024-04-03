# Intersection of Two Arrays

## Problem Statement

Given two integer arrays `nums1` and `nums2`, the goal is to compute their intersection. Every element in the result must be unique, and the order of the elements in the output does not matter.

## Examples

- **Example 1:**
  - Input: `nums1 = [1,2,2,1]`, `nums2 = [2,2]`
  - Output: `[2]`

- **Example 2:**
  - Input: `nums1 = [4,9,5]`, `nums2 = [9,4,9,8,4]`
  - Output: `[9,4]`
  - Explanation: `[4,9]` is also an acceptable output.

## Solution

The given solution involves sorting both arrays initially, which facilitates a more straightforward comparison process. A two-pointer technique is then used to traverse both arrays simultaneously. This method compares elements from each array, efficiently finding the intersection.

## Code Explanation

1. **Sort Both Arrays:** Initially, both input arrays are sorted. This step ensures that identical elements are positioned adjacently, making comparison easier.

2. **Initialize Pointers:** Two pointers, `i` and `j`, are initialized to start from the beginning of `nums1` and `nums2` respectively.

3. **Traverse Arrays:** The arrays are traversed using the pointers. At each step, the following conditions are checked:
   - If `nums1[i] < nums2[j]`, increment `i` to move forward in `nums1`.
   - If `nums1[i] > nums2[j]`, increment `j` to advance in `nums2`.
   - If `nums1[i] == nums2[j]`, this indicates an intersection. The element is added to the result list if it's not already included (to ensure uniqueness), and both `i` and `j` are incremented.

4. **Convert List to Array:** The result list is converted to an array before returning it as the final result.

## Example Walkthrough

Consider the inputs `nums1 = [4,9,5]` and `nums2 = [9,4,9,8,4]`.

1. After sorting, `nums1 = [4,5,9]` and `nums2 = [4,4,8,9,9]`.
2. Traverse both arrays using pointers. The intersection elements found are `[4,9]`.

## Solution Code

```java
public int[] intersection(int[] array1, int[] array2) {
    Arrays.sort(array1);
    Arrays.sort(array2);
    List<Integer> resultList = new ArrayList<>();

    int i = 0, j = 0;
    while (i < array1.length && j < array2.length) {
        if (array1[i] < array2[j]) {
            i++;
        } else if (array1[i] > array2[j]) {
            j++;
        } else {
            if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != array1[i]) {
                resultList.add(array1[i]);
            }
            i++;
            j++;
        }
    }

    int[] result = new int[resultList.size()];
    for (int k = 0; k < resultList.size(); k++) {
        result[k] = resultList.get(k);
    }

    return result;
}
```

## Complexity Analysis

- **Time Complexity:** O(n log n) + O(m log m), where `n` and `m` are the lengths of `nums1` and `nums2` respectively. The complexity arises from sorting both arrays, followed by a linear scan.
- **Space Complexity:** O(min(n, m)), which is the space required to store the intersection elements before converting them to an array to be returned.