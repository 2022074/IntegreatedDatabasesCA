/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integreateddatabasesca;

 /* 
 *@author achap
 */
 
public class Taxes {
    int calculationId;
    String taxesType;
    int userId;
    String status;
    int income;
    int taxesOwed;
    int tacesCredit;

    public Taxes(int calculationId, String taxesType, int userId, String status, int income, int taxesOwed, int tacesCredit) {
        this.calculationId = calculationId;
        this.taxesType = taxesType;
        this.userId = userId;
        this.status = status;
        this.income = income;
        this.taxesOwed = taxesOwed;
        this.tacesCredit = tacesCredit;
    }

    public int getCalculationId() {
        return calculationId;
    }

    public void setCalculationId(int calculationId) {
        this.calculationId = calculationId;
    }

    public String getTaxesType() {
        return taxesType;
    }

    public void setTaxesType(String taxesType) {
        this.taxesType = taxesType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getTaxesOwed() {
        return taxesOwed;
    }

    public void setTaxesOwed(int taxesOwed) {
        this.taxesOwed = taxesOwed;
    }

    public int getTacesCredit() {
        return tacesCredit;
    }

    public void setTacesCredit(int tacesCredit) {
        this.tacesCredit = tacesCredit;
    }
}

