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
    public RegularUser(String username, String password, String firstName, String lastName, String gender, String email, String marital_status, boolean if_married_both_work, boolean children, int id, int employeeID, boolean userType) {
        super(username, password, firstName, lastName, gender,email, marital_status, if_married_both_work, children, id, employeeID, userType);
    }
}
