# Reverse Pairs

## Problem Statement

Given an integer array `nums`, return the number of reverse pairs in the array. A reverse pair is defined as a pair `(i, j)` where `0 <= i < j < nums.length` and `nums[i] > 2 * nums[j]`.

## Examples

- **Example 1:**
  - Input: `nums = [1,3,2,3,1]`
  - Output: `2`
  - Explanation: There are two reverse pairs: `(1, 4)` and `(3, 4)`. In both cases, the first number is more than double the second number.

- **Example 2:**
  - Input: `nums = [2,4,3,5,1]`
  - Output: `3`
  - Explanation: There are three reverse pairs: `(1, 4)`, `(2, 4)`, and `(3, 4)`. In each pair, the first number is more than double the second number.

## Easy Explanation

The problem asks us to find pairs in an array where the first number is more than double the second number, and the first number comes before the second number in the array.

## Solution and Code Walkthrough

The solution involves dividing the array into smaller parts, counting reverse pairs in each part, and then merging the parts back while maintaining the order. Here's how the code works:

1. **Merge Function:** This function merges two sorted halves of the array while keeping them sorted.

2. **Count Pairs Function:** This function counts the reverse pairs between the two halves of the array.

3. **Merge Sort Function:** This function recursively divides the array into smaller parts, counts the reverse pairs, and merges them back.

4. **Reverse Pairs Function:** This is the main function that uses merge sort to count reverse pairs.

```java
private static void merge(int[] arr, int low, int mid, int high){
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low, right = mid + 1;

    while(left <= mid && right <= high){
        if(arr[left] <= arr[right]){
            temp.add(arr[left++]);
        } else {
            temp.add(arr[right++]);
        }
    }

    while(left <= mid){
        temp.add(arr[left++]);
    }
    while(right <= high){
        temp.add(arr[right++]);
    }
    for (int i = low; i <= high; i++) {
        arr[i] = temp.get(i - low);
    }
}

private static int countPairs(int[] arr, int low, int mid, int high){
    int count = 0, right = mid + 1;
    for(int i = low; i <= mid; i++){
        while(right <= high && arr[i] > (long)arr[right] * 2){
            right++;
        }
        count += right - (mid + 1);
    }
    return count;
}

public static int mergeSort(int[] arr, int low, int high){
    if(low >= high) return 0;
    int mid = low + (high - low) / 2, count = 0;
    count += mergeSort(arr, low, mid);
    count += mergeSort(arr, mid + 1, high);
    count += countPairs(arr, low, mid, high);
    merge(arr, low, mid, high);
    return count;
}

public int reversePairs(int[] nums) {
    return mergeSort(nums, 0, nums.length - 1);
}
```

## Example Walkthrough

For `nums = [2,4,3,5,1]`:

- The array is divided into smaller parts until they can no longer be divided.
- Then, we start merging them while counting the reverse pairs:
  - In the first merge, no reverse pairs are found.
  - As we merge `[2,4]` and `[3]`, we find one reverse pair `(2,4)`.
  - Merging `[5]` and `[1]` doesn't find any reverse pair immediately, but when these parts are merged back, we find reverse pairs involving `5` and `1`.
- Finally, the total count of reverse pairs is calculated as `3`.

### Time Complexity: O(2N*logN)

=> O(2N*logN), where N = size of the given array.<br/>
Reason: Inside the mergeSort() we call merge() and countPairs() except mergeSort() itself. Now, inside the function countPairs(), though we are running a nested loop, we are actually iterating the left half once and the right half once in total. That is why, the time complexity is O(N). And the merge() function also takes O(N). The mergeSort() takes O(logN) time complexity. Therefore, the overall time complexity will be O(logN * (N+N)) = O(2N*logN).

### Space Complexity: O(n)
=> O(N), as in the merge sort We use a temporary array to store elements in sorted order.

## Explanation Made Easy

This problem sounds complicated, but it's essentially about breaking down the array, sorting it, and counting specific pairs along the way. By carefully comparing elements as we merge sorted parts back together, we efficiently find all the reverse pairs.