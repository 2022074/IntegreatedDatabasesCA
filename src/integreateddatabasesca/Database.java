/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integreateddatabasesca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ari
 */
public class Database{
    private static final String DB_USER = "your_db_user";
    private static final String DB_PASSWORD = "your_db_password";
    private static final String DB_URL = "jdbc:mysql://localhost/EaturSoul";
    
    //List that contains all the users
    private static final List<Users> users = new ArrayList<>();
    //Here is created and stored the information of the users
    static {
        users.add(new Admin("CCT", "Dublin", "Admin", "User"));
        users.add(new RegularUser("user1", "pass123", "Regular", "User"));
    }
    //Getter for the users list
    public static List<Users> getUsers() {
        return users;
    }
}