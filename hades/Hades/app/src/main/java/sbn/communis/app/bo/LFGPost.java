package sbn.communis.app.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LFGPost {
    public Game game;
    public String rank;
    public String region;
    public String platform;
    public int reqPlayers;
    public String reqRoles;
    public boolean reqMic;
    //consider age

}
