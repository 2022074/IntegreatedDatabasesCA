/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integreateddatabasesca;

/**
 *
 * @author achap
 */
public class TaxCalculator {
    public static double calculateTax(Users user, double income) {
        String maritalStatus = user.getMarital_status();
        boolean hasChildren = user.isChildren();
        boolean bothWork =  user.isIf_married_both_work();

        double firstBracketLimit;
        double secondBracketRate;

        switch (maritalStatus) { //This switch is to differentiate between single and married users and check if they have children or not since the income tax changes depeding on those factors
            case "single":
                firstBracketLimit = hasChildren ? 44000 : 40000;
                secondBracketRate = 0.4;
                break;
            case "married":
                firstBracketLimit = bothWork ? 80000 : 49000;
                secondBracketRate = 0.4;
                break;
            default:
                throw new IllegalArgumentException("Invalid marital status");
        }

        double tax = 0;

        if (income <= firstBracketLimit) {
            // 20% of income in the first bracket
            tax = 0.2 * income;
        } else {
            // 20% of the first bracket limit
            tax = 0.2 * firstBracketLimit;

            // 40% of the remaining income
            tax += 0.4 * (income - firstBracketLimit);
        }

        return tax;
    }

    public static double calculateUSC(double income) { //This method is here for the only purpose of making use of the income of the user and checking how much they have to pay depeding on the amount earned in a year
        double usc = 0;

        if (income <= 12012) {
            usc = 0.005 * income; // The first 12012 or less than that get taxed at 0.5%
        } else if (income <= 22110) {
            income = income - 12012;
            usc = ((12012*0.005) + (income*0.02)); //The first 12012 get taxed at 0.5% and added to the tax of the rest which gets taxed at 2%
        } else if (income <= 69234) {
            income = income - 22110;
            usc = ((12012*0.005) + (10908*0.02) + (income*0.045)); //As before, we tax the first 12012 at 0.05% and then the next 10908 are taxed at 2% and both are added to the rest that is taxed at 4.5%
        } else {
            income = income - 69234;
            usc = ((12012*0.005) + (10908*0.02) + (47124*0.045) + (income*0.08)); //The same process as before but now anything above 69234 is taxed at 8%, everything is added together to get the USC
        }
        return usc;
    }

    public static double calculatePRSI(double income) {
        double weeklyIncome = income / 52;
        double prsi = 0;

        if (weeklyIncome > 352) {
            prsi = income * 0.04; // 4% of income
            return prsi;
        } else {
            return 0 ;
        }
    }


}
