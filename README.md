## Log

Here's where I'll keep a daily log of my progress, including what I learned, what I worked on, and any reflections or insights I've gained.

### Day 60: [11/03/2024]

**Today's Progress**:

## 1. Remove Element

The goal of this problem is to remove all instances of a specific value `val` from an array `nums`, in-place, and return the new length of the array after removal.

### Approach:

- Initialize a pointer `valid_size` to keep track of the length of the array after removals.
- Iterate through each element of the array `nums`.
- If the current element is not equal to `val`, copy it to the `nums[valid_size]` and increment `valid_size`.
- Return `valid_size` as the new length of the array.

### Code:

```java
public int removeElement(int[] nums, int val) {
    if(nums.length == 0) return 0;
    int valid_size = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != val) {
            nums[valid_size] = nums[i];
            valid_size++;
        }
    }
    return valid_size;
}
```
## Contains Duplicate

This problem asks if an array contains any duplicate elements. It's a common question that tests your understanding of data structures for efficient lookups.

### Approach:

- Use a `HashSet` to keep track of the elements we've seen so far.
- Iterate through each element in the array.
- For each element, check if it's already in our `HashSet`.
  - If it is, we've found a duplicate, so we return `true`.
  - If not, we add it to the `HashSet` and move on.
- If we finish checking all elements without finding any duplicates, we return `false`.

This approach leverages the `HashSet`'s constant time complexity for both insertion and lookup, making it efficient for this task.

### Code:

```java
public boolean containsDuplicate(int[] nums) {
    Set<Integer> uniques = new HashSet<>();
    for (int num : nums) {
        if (uniques.contains(num)) {
            return true;
        }
        uniques.add(num);
    }
    return false;
}
```
<!-- **Thoughts**: Delving into these questions, I navigated through array manipulations, optimized for performance, and unlocked new strategies for dealing with matrix transformations. -->

**Link to Todays Progress**: https://github.com/Gurupatel007/100Days-of-Code/blob/main/Day60/

### Todays questions

1. [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/description/).

2. [Remove Element](https://leetcode.com/problems/remove-element/)

<!-- 3. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/).
1 . [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/). -->

<!-- 5. [Plus Minus](https://www.hackerrank.com/challenges/plus-minus)

1. [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference) -->

<!-- 7. [A Very Big Sum](https://www.hackerrank.com/challenges/a-very-big-sum)

8. [Compare the Triplets](https://www.hackerrank.com/challenges/compare-the-triplets)

9. [Simple Array Sum](https://www.hackerrank.com/challenges/simple-array-sum)

10. [Solve Me First](https://www.hackerrank.com/challenges/solve-me-first) -->

<!-- 7. [Missing Number](https://leetcode.com/problems/missing-number/submissions/1186710654/) -->

## Projects

- **Music Player App**: A simple Music player app which plays the songs listed in it by accessing it from internet. - [https://codepen.io/Guru-the-lessful/full/eYXrMLw].

# 100 Days Of Code

Welcome to my journey through the **#100DaysOfCode** challenge! This repository is a living document of my progress, insights, and the projects I'll be tackling over the next 100 days. My goal is to improve my coding skills by dedicating at least an hour every day to coding, learning new technologies, and working on projects.

## About the Challenge

The #100DaysOfCode challenge is a commitment to coding for at least one hour every day for the next 100 days. The goal is to build, experiment, and enhance coding skills by consistently working on projects and learning new concepts. This challenge encourages accountability, sharing progress with the community, and pushing boundaries to learn and grow as a developer.

## Goals

- **Improve Problem-Solving Skills**: Tackle a variety of coding problems to enhance my logical thinking and problem-solving capabilities.
- **Learn New Technologies**: Dedicate time to learning new languages, frameworks, and tools that are relevant to my interests and career goals.
- **Build Projects**: Apply what I learn by building projects. This includes small utility tools, contributing to open source, or even developing full-fledged applications.
- **Consistency**: Cultivate the habit of coding daily, which is crucial for long-term success in the tech industry.

## How to Use This Repository

Feel free to explore this repository to see my progress and the projects I'm working on. Each directory within the repository is organized by project or day, containing all the relevant code and resources. If you're undertaking a similar journey, I hope my experience can provide you with ideas, inspiration, or guidance.

## Connect With Me

I'd love to connect with others who are also on their coding journey! Feel free to reach out to me on [LinkedIn](www.linkedin.com/in/guru-patel-42423b219) or follow me on [Twitter](https://twitter.com/Gurupat11727321). Let's share insights, resources, and support each other.

## Acknowledgments

- Thanks to the #100DaysOfCode community for the inspiration and support.
- [[Striver, Kunal, Love Babbar], Strivers A2Z DSA Course/Sheet]
