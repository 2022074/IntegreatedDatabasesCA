/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integreateddatabasesca;

/**
 *
 * @author Ari
 */
public class Users {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String marital_status;
    private boolean if_married_both_work;
    private boolean children;
    private int id;
    private int employeeID;
    private boolean userType;

    public Users(String username, String password, String firstName, String lastName, String gender, String email, String marital_status, boolean if_married_both_work, boolean children, int id, int employeeID, boolean userType) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.marital_status = marital_status;
        this.if_married_both_work = if_married_both_work;
        this.children = children;
        this.id = id;
        this.employeeID = employeeID;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public boolean isIf_married_both_work() {
        return if_married_both_work;
    }

    public void setIf_married_both_work(boolean if_married_both_work) {
        this.if_married_both_work = if_married_both_work;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public boolean getUserType() {
        return userType;
    }

    public void setUserType(boolean userType) {
        this.userType = userType;
    }
}