public class Main {

    public static void main(String[] args) {

        Post[] feed = CSVLoader.loadPosts("data/Instagram_Analytics.csv");

        System.out.println("\n===== 📊 Instagram Feed Insights Dashboard =====");

        System.out.println("\n📌 Total Posts: " + feed.length);
        System.out.println("❤️ Total Likes: " + Analyzer.totalLikes(feed));
        System.out.println("📈 Average Likes: " + Analyzer.averageLikes(feed));

        // MOST LIKED POST
        Post top = Analyzer.maxLikes(feed);
        System.out.println("\n🔥 Top Liked Post:");
        System.out.println(top.postId + " | Likes: " + top.likes);

        // LOWEST LIKED POST
        Post low = Analyzer.minLikes(feed);
        System.out.println("\n💤 Lowest Engagement Post:");
        System.out.println(low.postId + " | Likes: " + low.likes);

        // HIGHEST ENGAGEMENT RATE
        Post eng = Analyzer.maxEngagement(feed);
        System.out.println("\n⚡ Highest Engagement Rate:");
        System.out.println(eng.postId + " | Engagement Rate: " + eng.engagementRate);

        // MOST COMMON MEDIA
        System.out.println("\n🎥 Most Common Media Type:");
        System.out.println(Analyzer.mostCommonMedia(feed));

        // MOST COMMON TRAFFIC SOURCE
        System.out.println("\n🚦 Most Common Traffic Source:");
        System.out.println(Analyzer.mostCommonTraffic(feed));

        // BEST CATEGORY FOR FOLLOWER GROWTH
        System.out.println("\n🏆 Best Category for Gaining Followers:");
        System.out.println(Analyzer.bestCategoryFollowers(feed));

        System.out.println("\n===============================================\n");
    }
}
