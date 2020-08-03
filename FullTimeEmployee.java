/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author elkindev
 */

public class FullTimeEmployee  {
    private double weeklySalary;
    private double benefitDeduction;
    public void setWeeklySalary(double weeklySalaryIn) {
        weeklySalary = weeklySalaryIn;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public void setBenefitDeduction(double benefitDedIn) {
        benefitDeduction = benefitDedIn;
    }
    public double getBenefitDeduction() {
        return benefitDeduction;
    }
    public double findPaymentAmount() {
        return weeklySalary - benefitDeduction;
    }
}
