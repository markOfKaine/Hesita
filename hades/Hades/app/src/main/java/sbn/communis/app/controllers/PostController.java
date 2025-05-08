package sbn.communis.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sbn.communis.app.bo.Game;
import sbn.communis.app.bo.LFGPost;
import sbn.communis.app.managers.PostManager;

public class PostController {

    @PostMapping("createPost")
    public String createPost(@RequestParam Game game, @RequestParam String rank, @RequestParam String region, @RequestParam String platform, @RequestParam int reqPlayers, @RequestParam String reqRoles, @RequestParam boolean reqMic) {
        try{
            PostManager.createPost(game, rank, region, platform, reqPlayers, reqRoles, reqMic);
            return "Post created successfully";
        } catch (Exception e) {
            return "Error creating post: " + e.getMessage();
        }
    }

    @GetMapping("getGroup")
    public String getGroup(@RequestParam LFGPost lfgPost) {
        return "Group details for: " + lfgPost.toString();
    }
    
}
