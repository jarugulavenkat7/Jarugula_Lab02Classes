/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class EmployeeSalary {
    
    private double hourlyRate;
    private double insuranceRate;
    private double taxRate;
    private double pfRate;
    private static final int HOURS = 40;
/**
 * Constructs EmployeeSalary with the given hourlyRate, insuranceRate, taxRate 
 * and pfRate
 * @param hourlyRate Hourly pay rate of the Employee 
 * @param insuranceRate Insurance percentage
 * @param taxRate Tax percentage
 * @param pfRate PF percentage
 */
    public EmployeeSalary(double hourlyRate, double insuranceRate, double taxRate, double pfRate) {
        this.hourlyRate = hourlyRate;
        this.insuranceRate = insuranceRate;
        this.taxRate = taxRate;
        this.pfRate = pfRate;
    }
/**
 *  Constructs EmployeeSalary with the default value of instance variables
 */
    public EmployeeSalary() {
    }
/**
 * Returns hourly pay rate of the employee
 * @return Returns Hourly pay rate
 */
    public double getHourlyRate() {
        return hourlyRate;
    }
/**
 * Sets hourly pay rate of the employee
 * @param hourlyRate The hourlyRate to set
 */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
/**
 * Returns insurance percentage of the employee
 * @return Returns the Insurance percentage
 */
    public double getInsuranceRate() {
        return insuranceRate;
    }
/**
 * Sets insurance percentage of the employee
 * @param insuranceRate The insuranceRate to set
 */
    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }
/**
 * Returns the tax percentage of the employee
 * @return Returns the Tax percentage 
 */
    public double getTaxRate() {
        return taxRate;
    }
/**
 * Sets tax percentage of the employee
 * @param taxRate The tax percentage to set
 */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
/**
 * Returns PF percentage of the employee
 * @return Returns PF percentage 
 */
    public double getPfRate() {
        return pfRate;
    }
/**
 * Sets PF percentage of the employee
 * @param pfRate The PF percentage to set
 */
    public void setPfRate(double pfRate) {
        this.pfRate = pfRate;
    }

/**
 * Calculates and returns the monthly salary of the employee
 * @return monthly salary of the employee
 */    
    public double calcMonthlySalary(){
        return hourlyRate*HOURS*4;
    }
/**
 * Calculates and returns the monthly insurance of the employee
 * @return monthly insurance of the employee
 */ 
    public double calcMonthlyInsurance(){
        return (calcMonthlySalary()*insuranceRate)/100;
    }
/**
 * Calculates and returns the PF amount of the employee
 * @return monthly PF amount of the employee
 */    
     public double calcMonthlyPfAmount(){
      return   (calcMonthlySalary()* pfRate)/100;
    }
/**
 * Calculates and returns the annual gross salary of the employee
 * @param bonus
 * @return annual gross salary of the employee
 */    
    public double calcAnnualGrossSalary(double bonus){
        return (bonus + (calcMonthlySalary()*12)) ;
    }
/**
 * Calculates and returns the annual net pay of the employee
 * @param bonus
 * @return annual net pay of the employee
 */
    public double calcAnnualNetPay(double bonus){
        double calcAnnualGrossSalary = calcAnnualGrossSalary(bonus) ;
        double annualPfAmount = (calcMonthlyPfAmount()*12);
        double annualInsurance = (calcMonthlyInsurance()*12);
        double annualNetPay = calcAnnualGrossSalary - 
                (calcAnnualGrossSalary*taxRate/100) -
                annualInsurance - annualPfAmount ; 
        return annualNetPay;
    }
/**
 * Returns EmployeeSalary object in string format
 * @return EmployeeSalary object in string format
 */
    @Override
    public String toString() {
        return "hourlyRate: " + hourlyRate + ", insuranceRate: " + insuranceRate 
                + ", taxRate: " + taxRate + ", pfRate: " + pfRate + ", HOURS: "
                + HOURS;
    }
    
    
    
}

