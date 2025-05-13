package sbn.communis.app.managers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import sbn.communis.app.managers.OracleManager;
import sbn.communis.app.managers.UserManager;
import sbn.communis.app.bo.User;

public class UserManager {
    
    public static UserManager instance = null;
    private static HashMap<String, User> userDatabase = new HashMap<>();

    private UserManager() {
        // Private constructor to prevent instantiation
    }
    
    public static UserManager getInstance(){
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public static Set<String> getUsers() {
        return userDatabase.keySet();
    }

    public static User createUser(String username, String password, String email, String phoneNumber, String address) {
        if (userDatabase.containsKey(username)) {
            throw new IllegalArgumentException("User already exists");
        }

        User newUser = new User(username, password, email, phoneNumber, address);
        writeUser(username, password, email, phoneNumber, address); //SEE ORACLE MANAGER
        userDatabase.put(username, newUser);
        return newUser;
    }

    public static String deleteUser(String username) {
        if (!userDatabase.containsKey(username)) {
            throw new IllegalArgumentException("User does not exist");
        }
        deleteUser(username, password); //SEE ORACLE MANAGER
        userDatabase.remove(username);
        return "User deleted successfully";
    }

    public static String changePassword(String username, String oldPassword, String newPassword) {
        if (!userDatabase.containsKey(username)) {
            throw new IllegalArgumentException("User does not exist");
        }
        User user = userDatabase.get(username);
        if (!user.getPassword().equals(oldPassword)) {
            throw new IllegalArgumentException("Old password is incorrect");
        }
        updatePassword(username, oldPassword, newPassword);
        user.setPassword(newPassword);
        return "Password changed successfully";
    }
}
