# Subarray Sum Equals K

## Problem Statement
Given an array of integers `nums` and an integer `k`, return the total number of subarrays whose sum equals to `k`. A subarray is a contiguous non-empty sequence of elements within an array.

### Examples

- **Example 1:**
  - Input: `nums = [1,1,1], k = 2`
  - Output: `2`

- **Example 2:**
  - Input: `nums = [1,2,3], k = 3`
  - Output: `2`

## Approach and Solutions

### Approach 1: Using HashMap
This approach uses a HashMap to keep track of the cumulative sums encountered so far and the number of times each sum occurs. This way, for each new sum encountered, we can check if `sum - k` exists in the map, which indicates that a subarray summing up to `k` has been found.

#### Algorithm
1. Initialize a variable `sum` to store the cumulative sum and a variable `count` to store the number of subarrays.
2. Create a HashMap `map` to store the cumulative sum as key and its occurrence count as value. Initialize it with `0` as key and `1` as value.
3. Iterate through the array `nums`:
   - Add the current element to `sum`.
   - Calculate `rem = sum - k`.
   - If `rem` exists in `map`, add its value to `count`.
   - Update `map` with the new `sum`, incrementing its value by `1`.
4. Return `count`.

#### Code 1

```java
public int subarraySum(int[] nums, int k) {
    int sum = 0;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);

    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        if (map.containsKey(sum - k)) {
            count += map.get(sum - k);
        }
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
}
```

### Approach 2: Brute Force

This brute-force approach involves iterating through all possible subarrays and calculating their sums, incrementing the count whenever a sum equals `k`.

#### Algorithm
- Initialize `cnt` to `0` to count the number of subarrays.
- Use two nested loops to go through all possible subarrays:
  - For each subarray defined by the start index `i` and the end index `j`, calculate its sum.
  - If the sum equals `k`, increment `cnt`.
- Return `cnt`.

#### Code 2

```java
public int subarraySum(int[] nums, int k) {
    int n = nums.length;
    int cnt = 0;

    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < n; j++) {
            sum += nums[j];
            if (sum == k) cnt++;
        }
    }
    return cnt;
}
```
