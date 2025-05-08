package sbn.communis.app.managers;

import sbn.communis.app.bo.Game;
import sbn.communis.app.bo.LFGPost;

public class PostManager {

    public static PostManager instance = null;

    public static PostManager getInstance() {
        if (instance == null) {
            instance = new PostManager();
        }
        return instance;
    }

    public static void createPost(Game game, String rank, String region, String platform, int reqPlayers, String reqRoles, boolean reqMic) {
        // Create a new LFGPost object with the provided parameters
        LFGPost post = new LFGPost(game, rank, region, platform, reqPlayers, reqRoles, reqMic);
        
        // Save the post to the database (this is a placeholder, implement actual database logic)
        // Database.save(post);
        
        // Return the created post (this is a placeholder, implement actual return logic)
        // return post;
    }



    
}
