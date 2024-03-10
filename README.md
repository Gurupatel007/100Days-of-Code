## Log

Here's where I'll keep a daily log of my progress, including what I learned, what I worked on, and any reflections or insights I've gained.

### Day 59: [10/03/2024]

**Today's Progress**:

#### Best Time to Buy and Sell Stock

Welcome to Day59 🙏

Today i have solved a one of the mostly asked question in companies (𝐁𝐞𝐬𝐭 𝐓𝐢𝐦𝐞 𝐭𝐨 𝐁𝐮𝐲 𝐚𝐧𝐝 𝐒𝐞𝐥𝐥 𝐒𝐭𝐨𝐜𝐤) on #leetcode.

Best Time to Buy and Sell Stock✅

𝑴𝒚 𝒂𝒑𝒑𝒓𝒐𝒂𝒄𝒉 𝒊𝒏 𝒂 𝒃𝒊𝒕 𝒅𝒊𝒇𝒇𝒆𝒓𝒆𝒏𝒕 𝒘𝒂𝒚

1. Imagine you're keeping an eye on the prices of a toy you want to buy, which changes every day.

2. You start with no idea of the cheapest price yet, so you think of the highest possible price (something that's definitely more than any price you'll see) as your starting point.

3. Each day, you check the toy's price. If it's cheaper than any price you've remembered before, you update your memory with this new lower price.

4. Now, you also think, "If I bought it at the cheapest price I remember, and sold it at today's price, how much money could I make?" You figure out this possible profit.

5. But you're smart; you don't settle yet. You keep updating this "best profit" if you find a day where the difference between that day's price and the cheapest price you remember is even more significant.

6. In the end, after you've checked all the days, you know the best time to have bought and sold the toy to make the most money.

### Let's visualize the approach with a sample array of prices: [7, 1, 5, 3, 6, 4]

Starting Point:
No transactions have occurred.
minPrice = ∞, maxProfit = 0

Day 1: Price = 7<br>
minPrice = min(∞, 7) = 7<br>
maxProfit = max(0, 7-7) = 0

Day 2: Price = 1<br>
minPrice = min(7, 1) = 1<br>
maxProfit = max(0, 1-1) = 0

Day 3: Price = 5<br>
minPrice = min(1, 5) = 1<br>
maxProfit = max(0, 5-1) = 4

Day 4: Price = 3<br>
minPrice = min(1, 3) = 1<br>
maxProfit = max(4, 3-1) = 4

Day 5: Price = 6<br>
minPrice = min(1, 6) = 1<br>
maxProfit = max(4, 6-1) = 5

Day 6: Price = 4<br>
minPrice = min(1, 4) = 1<br>
maxProfit = max(5, 4-1) = 5

Conclusion: The best time to have bought the stock was on Day 2 at a price of 1, and the best time to have sold it was on Day 5 at a price of 6, making a profit of 5.
<!-- **Thoughts**: Delving into these questions, I navigated through array manipulations, optimized for performance, and unlocked new strategies for dealing with matrix transformations. -->

**Link to Todays Progress**: https://github.com/Gurupatel007/100Days-of-Code/blob/main/Day59/

### Todays questions

<!-- 1. [Plus One](https://leetcode.com/problems/plus-one/).

2. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

3. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/). -->
1 . [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/).

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
