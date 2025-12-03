import java.util.HashMap;

public class Analyzer {

    // TOTAL LIKES
    public static long totalLikes(Post[] feed) {
        long sum = 0;
        for (Post p : feed) sum += p.likes;
        return sum;
    }

    // AVERAGE LIKES
    public static double averageLikes(Post[] feed) {
        return (double) totalLikes(feed) / feed.length;
    }

    // MAX LIKES
    public static Post maxLikes(Post[] feed) {
        Post best = feed[0];
        for (Post p : feed) {
            if (p.likes > best.likes) best = p;
        }
        return best;
    }

    // MIN LIKES
    public static Post minLikes(Post[] feed) {
        Post worst = feed[0];
        for (Post p : feed) {
            if (p.likes < worst.likes) worst = p;
        }
        return worst;
    }

    // MAX ENGAGEMENT RATE
    public static Post maxEngagement(Post[] feed) {
        Post best = feed[0];
        for (Post p : feed) {
            if (p.engagementRate > best.engagementRate) best = p;
        }
        return best;
    }

    // MOST COMMON MEDIA TYPE (Photo/Reel/Video/Carousel)
    public static String mostCommonMedia(Post[] feed) {
        HashMap<String, Integer> freq = new HashMap<>();

        for (Post p : feed) {
            freq.put(p.mediaType, freq.getOrDefault(p.mediaType, 0) + 1);
        }

        String most = "";
        int max = 0;

        for (String key : freq.keySet()) {
            if (freq.get(key) > max) {
                max = freq.get(key);
                most = key;
            }
        }

        return most;
    }

    // MOST COMMON TRAFFIC SOURCE
    public static String mostCommonTraffic(Post[] feed) {
        HashMap<String, Integer> freq = new HashMap<>();

        for (Post p : feed) {
            freq.put(p.trafficSource, freq.getOrDefault(p.trafficSource, 0) + 1);
        }

        String most = "";
        int max = 0;

        for (String key : freq.keySet()) {
            if (freq.get(key) > max) {
                max = freq.get(key);
                most = key;
            }
        }

        return most;
    }

    // CATEGORY WITH MOST FOLLOWERS GAINED
    public static String bestCategoryFollowers(Post[] feed) {
        HashMap<String, Integer> map = new HashMap<>();

        for (Post p : feed) {
            map.put(p.contentCategory,
                    map.getOrDefault(p.contentCategory, 0) + p.followersGained);
        }

        String best = "";
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                best = key;
            }
        }

        return best;
    }

    // REVERSE FEED
    public static void reverse(Post[] feed) {
        int left = 0, right = feed.length - 1;

        while (left < right) {
            Post temp = feed[left];
            feed[left] = feed[right];
            feed[right] = temp;

            left++;
            right--;
        }
    }
}
