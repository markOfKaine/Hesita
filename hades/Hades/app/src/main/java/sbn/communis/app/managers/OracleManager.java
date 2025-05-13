package sbn.communis.app.managers;

public class OracleManager{

    public static OracleManager instance = null; 

    String database = " "; 
    String database_key = " "; 
    
    //STORED PROCEDURE RESULT IS NOT A REAL VARIABLE YET, STORED PROCEDURES WILL BE IMPLEMENTED INTO THE DATABASE WHEN LIVE

    public static OracleManager getInstance(){
        if(instance == null){ 
            instance = new OracleManager; 
        }
        return instance;
    }  

    //USER DB INTERACTIONS 
    public static String writeUser(String username, String password, String email, String phoneNumber, String address){ 
        if(stored_procedure_result == 1){ 
            return "Successfully wrote user to database"; 
        }
        return IllegalArgumentException("Failed to write user to database"); 

    }

    public static String deleteUser(String username, String password, String email){ 
        //Stored procedure will check that email and password are correct based off of the query from the username
        if(stored_procedure_result == 1){ 
            return "Successfully deleted user"; 
        }
        return IllegalArgumentException("Failed to delete user from database"); 

    }

    public static String updatePassword(String username, String prevPassword, String newPassword){
        //Stored procedure verifys user identity by checking accuracy of prevPassword then updates to new password if successful
        if(stored_procedure_result == 1){ 
            return "Successfully updated user password"; 
        }
        return IllegalArgumentException("Failed to update user password"); 
    }

    public static User getUserInfo(String username, String password){ 
        User info = null; 
        stored_procedure_result; 
        if(stored_procedure_result == null){ 
            return IllegalArgumentException("Failed to get user info"); 
        }
        return info; 
    }
    
    '''
    //LFGPost DB INTERACTIONS not sure if we actually need these yet  
    public static String writePost(Game game, String rank, String region, String platform, int reqPlayers, String recRoles, boolean reqMic){ 
        if(stored_procedure_result == 1){ 
            return "Successfully wrote post to database"; 
        }
        return IllegalArgumentException("Failed to write user to database"); 
    }

    public static LFGPost getPostInfo(){ 
        LFGPost info = null; 
        stored_procedure_result; 
        if(stored_procedure_result == null){ 
            return IllegalArgumentException("Failed to get post info"); 
        }
        return info; 
    }
    '''
}
