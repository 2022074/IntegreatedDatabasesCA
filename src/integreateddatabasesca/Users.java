/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integreateddatabasesca;

/**
 *
 * @author Ari
 */
public abstract class Users {
    private String username;
    private String password;
    private String name;
    private String surname;
    private UserType userType;

    public Users(String username, String password, String name, String surname, UserType userType) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public UserType getUserType() {
        return userType;
    }
    
    public void modifyProfile(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}