package com.academy_it.service;

import com.academy_it.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * User initialization class
 */
@Data
@AllArgsConstructor
public class LoginService {
    private List<User> users = new ArrayList<>();

    public LoginService() {
        User user = new User("Fedor", "12345");
        User user1 = new User("Yarik", "12345");
        User user2 = new User("Dmitry", "12345");
        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    /**
     * Verification of the user's login and password
     *
     * @param login
     * @param password
     * @return
     */
    public boolean checkCredentials(String login, String password) {
        for (User user : users) {
            if ((user.getNameUser().equals(login)) && (user.getPasswordUser().equals(password))) {
                return true;
            }
        }
        return false;
    }
}