## Log

Here's where I'll keep a daily log of my progress, including what I learned, what I worked on, and any reflections or insights I've gained.

### Day 57: [08/03/2024]

**Today's Progress**:

#### Find the Duplicate Number

Hello, fellow coders! Today, amidst the whirlwind of my exam preparations, I took on a medium-level challenge on #LeetCode titled "Find the Duplicate Number." It was a rewarding detour into the realm of array manipulation and applying efficient algorithms. Let's dive into the approach and solution!

🛠️ Problem & Approach:

Objective: Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), find the duplicate number. The catch is doing so without extra space for another array and in linear runtime complexity.

Solution with HashSet: My strategy involved using a HashSet to track the numbers as I iterate through the array. The core idea is straightforward:

Iterate over the array.

- For each element, check if it's already in the HashSet. If yes, that's our duplicate. Return it immediately.

- If no, add the element to the HashSet.

- If no duplicates are found (though the problem statement guarantees at least one duplicate exists), return 0.

🧩 𝐓𝐢𝐦𝐞 & 𝐒𝐩𝐚𝐜𝐞 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲:

𝐄𝐟𝐟𝐢𝐜𝐢𝐞𝐧𝐜𝐲: The use of HashSet allows for constant time complexity (O(1)) for both insertion and lookup operations. This ensures that our overall approach remains O(n), adhering to the problem's constraints regarding runtime complexity.

𝐒𝐩𝐚𝐜𝐞 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲: Although the problem statement asks for solving the problem without extra space, for learning purposes, this approach showcases the trade-off between time and space complexity. Using a HashSet requires O(n) space.

<!-- **Thoughts**: Delving into these questions, I navigated through array manipulations, optimized for performance, and unlocked new strategies for dealing with matrix transformations. -->

**Link to Todays Progress**: https://github.com/Gurupatel007/100Days-of-Code/blob/main/Day57/

### Todays questions

<!-- 1. [Plus One](https://leetcode.com/problems/plus-one/).

2. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

3. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/). -->

1. [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/).

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
