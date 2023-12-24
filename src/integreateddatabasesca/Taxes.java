/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integreateddatabasesca;

 * @author achap
 */
 
public class Taxes {
    int incomeGross;
    int taxCredits;
    int taxesOwed;

    public Taxes(int incomeGross, int taxCredits, int taxesOwed) {
        this.incomeGross = incomeGross;
        this.taxCredits = taxCredits;
        this.taxesOwed = taxesOwed;
    }

    public int getIncomeGross() {
        return incomeGross;
    }

    public void setIncomeGross(int incomeGross) {
        this.incomeGross = incomeGross;
    }

    public int getTaxCredits() {
        return taxCredits;
    }

    public void setTaxCredits(int taxCredits) {
        this.taxCredits = taxCredits;
    }

    public int getTaxesOwed() {
        return taxesOwed;
    }

    public void setTaxesOwed(int taxesOwed) {
        this.taxesOwed = taxesOwed;
    }
    
    
}

