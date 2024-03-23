# First Bad Version

## Problem Statement

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

You are given an API `bool isBadVersion(version)` which returns whether a version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

### Examples

#### Example 1:

- Input: n = 5, bad = 4
- Output: 4
- Explanation: `isBadVersion(3)` -> false, `isBadVersion(5)` -> true, `isBadVersion(4)` -> true. Then 4 is the first bad version.

#### Example 2:

- Input: n = 1, bad = 1
- Output: 1

## Approach

### Binary Search

This approach utilizes a binary search algorithm to minimize the number of calls to the API, improving efficiency.

- Initialize two pointers, `left = 1` and `right = n`.
- While `left` is less than `right`, calculate the midpoint `mid` to reduce the search space by half.
    - If `isBadVersion(mid)` returns true, then the first bad version is at `mid` or to the left of `mid`. Thus, we move `right` to `mid`.
    - Otherwise, the first bad version is to the right of `mid`, so we update `left` to `mid + 1`.
- The loop exits when `left == right`, which will be the first bad version.

### Code

```java
public int firstBadVersion(int n) {
    int left = 1, right = n;
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (isBadVersion(mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}
```
## Complexity Analysis

- **Time Complexity**: O(log n), where n is the total number of versions. The algorithm's time complexity comes from the binary search.
- **Space Complexity**: O(1), as it only uses two pointers regardless of the input size.
