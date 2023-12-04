/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integreateddatabasesca;

/**
 *
 * @author Ari
 */
public class RegularUser extends Users{
    public RegularUser(String username, String password, String name, String surname) {
        super(username, password, name, surname, UserType.REGULAR_USER);
    }
}
