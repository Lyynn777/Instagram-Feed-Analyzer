![Java](https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=openjdk)
![Status](https://img.shields.io/badge/Project%20Status-Active-brightgreen?style=for-the-badge)
![Built With](https://img.shields.io/badge/Built%20With-Arrays,%20HashMaps,%20DSA-blue?style=for-the-badge)
![Dataset Size](https://img.shields.io/badge/Dataset-30K%20posts-orange?style=for-the-badge)


# 📊 Instagram Feed Insights Analyzer  
A Java-based analytics engine that processes 30,000 real Instagram-style posts and generates meaningful insights using core Array operations.

This project is the **first module** of my “ArrayVerse — Array Patterns Mastery” series, where each DSA pattern is demonstrated through a real-world project.

---

## Project Overview
This tool reads a dataset containing fields such as:

- `post_id`
- `upload_date`
- `media_type`
- `likes`, `comments`, `shares`, `saves`
- `reach`, `impressions`
- `caption_length`, `hashtags_count`
- `followers_gained`
- `traffic_source`
- `engagement_rate`
- `content_category`

Using these fields, the engine produces insights including:

### ✔ Total Likes  
### ✔ Average Likes  
### ✔ Most Liked Post  
### ✔ Least Liked Post  
### ✔ Highest Engagement Rate  
### ✔ Most Common Media Type  
### ✔ Most Common Traffic Source  
### ✔ Best Category for Gaining Followers  

The analysis is powered by **pure array operations**, making this a strong demonstration of DSA fundamentals applied to real data.

---

## How to Run

1. Install Java (JDK 17+ recommended)
2. Open the project folder in VS Code or any editor
3. Run:

```
javac src/*.java
java -cp src Main
```
Make sure the dataset file path in `Main.java` is correct:
Post[] feed = CSVLoader.loadPosts("data/instagram_dataset.tsv");

---

# Technologies Used
- Java (core logic)

- BufferedReader for file parsing

- Arrays & HashMaps for analytics

- DSA fundamentals (max/min, aggregation, frequency maps, etc.)

