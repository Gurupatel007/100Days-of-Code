# Capacity To Ship Packages Within D Days

## Problem Statement

A conveyor belt has packages that must be shipped from one port to another within `days` days.

The `ith` package on the conveyor belt has a weight of `weights[i]`. Each day, we load the ship with packages on the conveyor belt (in the order given by `weights`). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within `days` days.

## Examples

- **Example 1:**
  - Input: `weights = [1,2,3,4,5,6,7,8,9,10], days = 5`
  - Output: `15`
  - Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
    - 1st day: 1, 2, 3, 4, 5
    - 2nd day: 6, 7
    - 3rd day: 8
    - 4th day: 9
    - 5th day: 10
  - Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
  
- **Example 2:**
  - Input: `weights = [3,2,2,4,1,4], days = 3`
  - Output: `6`
  - Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
    - 1st day: 3, 2
    - 2nd day: 2, 4
    - 3rd day: 1, 4
    
- **Example 3:**
  - Input: `weights = [1,2,3,1,1], days = 4`
  - Output: `3`
  - Explanation:
    - 1st day: 1
    - 2nd day: 2
    - 3rd day: 3
    - 4th day: 1, 1

## Constraints

- `1 <= days <= weights.length <= 5 * 10^4`
- `1 <= weights[i] <= 500`

## Code Walkthrough

The solution involves using binary search to find the minimum weight capacity of the ship that can ship all the packages within `days` days. We start by initializing `left` to 0 and `right` to the sum of all weights. Then, we iteratively narrow down the search space using binary search, checking if it's feasible to ship all the packages within the given days with the current mid capacity.

## Implementation

### Description

In this implementation, we define a method `feasible` to check if it's possible to ship all the packages within `days` days with a given capacity. Then, we initialize `left` to 0 and `right` to the sum of all weights. We perform binary search on the capacity range [left, right] to find the minimum feasible capacity.

### Code

```java
public boolean feasible(int capacity, int[] weights, int days) {
    int day = 1;
    int total = 0;

    for (int wh : weights) {
        total += wh;
        if (total > capacity) {
            total = wh;
            day += 1;
            if (day > days) {
                return false;
            }
        }
    }
    return true;
}

public int shipWithinDays(int[] weights, int days) {
    int left = 0;
    int right = 0;
    for (int val : weights) {
        right += val;
        left = Math.max(left, val);
    }
    if (weights.length == days) {
        return left;
    }
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (feasible(mid, weights, days)) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return left;
}
```

## Step-by-Step Visualization

### Iteration 1:
- Capacity range: [0, 55]
- Mid capacity: 27
- Feasible? Yes
- New capacity range: [0, 26]

### Iteration 2:
- Capacity range: [0, 26]
- Mid capacity: 13
- Feasible? No
- New capacity range: [14, 26]

### Iteration 3:
- Capacity range: [14, 26]
- Mid capacity: 20
- Feasible? No
- New capacity range: [21, 26]

### Iteration 4:
- Capacity range: [21, 26]
- Mid capacity: 23
- Feasible? No
- New capacity range: [24, 26]

### Iteration 5:
- Capacity range: [24, 26]
- Mid capacity: 25
- Feasible? No
- New capacity range: [26, 26]

### Iteration 6:
- Capacity range: [26, 26]
- Mid capacity: 26
- Feasible? No
- New capacity range: [27, 26]

### Iteration 7:
- Capacity range: [27, 26]
- Mid capacity: 26
- Feasible? No
- New capacity range: [28, 26]

### Final Result: 28

## Time and Space Complexity

- **Time Complexity:** O(Nlog(S)), where N is the length of the `weights` array and S is the sum of all weights. Binary search is performed on the capacity range [left, right].
- **Space Complexity:** O(1), as we use only constant extra space regardless of the input size.

