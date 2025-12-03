public class Post {
    String postId;
    String uploadDate;
    String mediaType;

    int likes;
    int comments;
    int shares;
    int saves;

    int reach;
    int impressions;

    int captionLength;
    int hashtagsCount;
    int followersGained;

    String trafficSource;   // Home Feed, Hashtags, Explore, Reels Feed, etc.
    double engagementRate;

    String contentCategory; // Technology, Beauty, Food, Fitness...

    public Post(String postId, String uploadDate, String mediaType,
                int likes, int comments, int shares, int saves,
                int reach, int impressions,
                int captionLength, int hashtagsCount, int followersGained,
                String trafficSource, double engagementRate,
                String contentCategory) {

        this.postId = postId;
        this.uploadDate = uploadDate;
        this.mediaType = mediaType;

        this.likes = likes;
        this.comments = comments;
        this.shares = shares;
        this.saves = saves;

        this.reach = reach;
        this.impressions = impressions;

        this.captionLength = captionLength;
        this.hashtagsCount = hashtagsCount;
        this.followersGained = followersGained;

        this.trafficSource = trafficSource;
        this.engagementRate = engagementRate;

        this.contentCategory = contentCategory;
    }
}
