## Log

Here's where I'll keep a daily log of my progress, including what I learned, what I worked on, and any reflections or insights I've gained.

### Day 62: [13/03/2024]

**Today's Progress**:

# Find the Pivot Integer

## Problem Statement
Given a positive integer `n`, find the pivot integer `x` such that:
- The sum of all elements between 1 and `x` inclusively equals the sum of all elements between `x` and `n` inclusively.
- Return the pivot integer `x`. If no such integer exists, return `-1`. It is guaranteed that there will be at most one pivot index for the given input.

## Examples

**Example 1:**
- Input: `n = 8`
- Output: `6`
- Explanation: `6` is the pivot integer since: `1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21`.

**Example 2:**
- Input: `n = 1`
- Output: `1`
- Explanation: `1` is the pivot integer since: `1 = 1`.

**Example 3:**
- Input: `n = 4`
- Output: `-1`
- Explanation: It can be proved that no such integer exist.

## Approach
To find the pivot integer, we iterate through the numbers from `1` to `n` and calculate the sum of numbers from `1` to `i` (inclusive) and the sum of numbers from `i` to `n` (inclusive). If we find a point where these sums are equal, `i` is the pivot integer. If no such point exists, we return `-1`.

### Steps:
1. Loop through `1` to `n` inclusive, calculating three sums for each iteration:
    - The total sum of numbers from `1` to `n`, calculated once outside the loop as `sumOfN = (n * (n + 1)) / 2`.
    - The sum of numbers from `1` to `i`, calculated as `sum1 = (i * (i + 1)) / 2`.
    - The sum of numbers from `i` to `n`, which is `sumOfN - sum1 + i` (adjusting for the overlap at `i`).
2. If `sum1` equals the adjusted sum from `i` to `n`, return `i` as the pivot integer.
3. If the loop completes without finding an equal sum, return `-1`.

### Code
```java
public int pivotInteger(int n) {
    for(int i = 1; i <= n; i++){
        int sumOfN = (n * (n + 1)) / 2;
        int sum1 = (i * (i + 1)) / 2;
        int sum2 = sumOfN - sum1 + i;
        if(sum1 == sum2) return i;
    }
    return -1;
}
```
<!-- **Thoughts**: Delving into these questions, I navigated through array manipulations, optimized for performance, and unlocked new strategies for dealing with matrix transformations. -->

**Link to Todays Progress**: https://github.com/Gurupatel007/100Days-of-Code/blob/main/Day62/

### Todays questions

1. [Find the Pivot Integer](https://leetcode.com/problems/find-the-pivot-integer/?envType=daily-question&envId=2024-03-13).

<!-- 2. [Remove Element](https://leetcode.com/problems/remove-element/) -->

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
