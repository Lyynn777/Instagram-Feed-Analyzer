import java.io.*;
import java.util.*;

public class CSVLoader {

    public static Post[] loadPosts(String filePath) {

        List<Post> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");

                Post p = new Post(
                        parts[0],                      // post_id
                        parts[1],                      // upload_date
                        parts[2],                      // media_type

                        Integer.parseInt(parts[3]),    // likes
                        Integer.parseInt(parts[4]),    // comments
                        Integer.parseInt(parts[5]),    // shares
                        Integer.parseInt(parts[6]),    // saves

                        Integer.parseInt(parts[7]),    // reach
                        Integer.parseInt(parts[8]),    // impressions

                        Integer.parseInt(parts[9]),    // caption_length
                        Integer.parseInt(parts[10]),   // hashtags_count
                        Integer.parseInt(parts[11]),   // followers_gained

                        parts[12],                    // traffic_source
                        Double.parseDouble(parts[13]), // engagement_rate

                        parts[14]                     // content_category
                );

                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list.toArray(new Post[0]);
    }
}

