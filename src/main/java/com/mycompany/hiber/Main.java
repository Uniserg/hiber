package com.mycompany.hiber;

import com.mycompany.hiber.models.Auto;
import com.mycompany.hiber.models.User;
import com.mycompany.hiber.services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = new User("Sergei", 19);
        userService.saveUser(user);
        Auto lamb = new Auto("Lamborghini", "orange");
        lamb.setUser(user);
        user.addAuto(lamb);
//        Auto ferrari = new Auto("Ferrari", "red");
//        ferrari.setUser(user);
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Ford", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
        userService.updateUser(user);
    }
}