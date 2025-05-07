package sbn.communis.app.controllers;

import sbn.communis.app.managers.UserManager;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("getUsers")
    public String getUsers() {
        Set<String> users = UserManager.getUsers();
        return users.toString();

    }
    

    @PostMapping("create")
    public String createUser(@RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam String phoneNumber, @RequestParam String address) {
        try{
            UserManager.createUser(username, password, email, phoneNumber, address);
            return "User created successfully";
        } catch (Exception e) {
            return "Error creating user: " + e.getMessage();
        }
    }

    @DeleteMapping("delete")
    public String deleteUser(@RequestParam String username) {
        try{
            UserManager.deleteUser(username);
            return "User deleted successfully";
        } catch (Exception e) {
            return "Error deleting user: " + e.getMessage();
        }
    }

    @PostMapping("changePassword")
    public String changePassword(@RequestParam String username, @RequestParam String oldPassword, @RequestParam String newPassword) {
        try{
            UserManager.changePassword(username, oldPassword, newPassword);
            return "Password changed successfully";
        } catch (Exception e) {
            return "Error changing password: " + e.getMessage();
        }
    }
}
    
