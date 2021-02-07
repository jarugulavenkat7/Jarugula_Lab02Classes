/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;

import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class EmployeeSalaryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Testing the EmployeeSalary class:");
        System.out.print("Enter the hourly pay rate of the Employee: $");
        double hourlyRate = scan.nextDouble();
        System.out.print("Enter the insurance rate of the Employee in percentage: ");
        double insuranceRate = scan.nextDouble();
        System.out.print("Enter the tax rate of the Employee in percentage: ");
        double taxRate = scan.nextDouble();
        System.out.print("Enter the pf rate of the Employee in percentage: ");
        double pfRate = scan.nextDouble();
        System.out.print("Enter the bonus of the Employee: ");
        double bonus = scan.nextDouble();
        
        EmployeeSalary empSalObj1= new EmployeeSalary(hourlyRate,insuranceRate,taxRate,pfRate);
        System.out.println("The details of empSalObj1 object are as follows:");
        System.out.println(empSalObj1);
        System.out.println("The monthly salary of the Employee is: $"+empSalObj1.calcMonthlySalary());
        System.out.println("The monthly insurance of the Employee is: $"+empSalObj1.calcMonthlyInsurance());
        System.out.println("The monthly pf of the Employee is: $"+empSalObj1.calcMonthlyPfAmount());
        System.out.println("The annual gross salary of the Employee is: $"+empSalObj1.calcAnnualGrossSalary(bonus));
        System.out.println("The gross annual net pay of the Employee is: $"+empSalObj1.calcAnnualNetPay(bonus));
        System.out.println("**************************************************");
        System.out.println("The details of empSalObj2 object are as follows:");
        EmployeeSalary empSalObj2= new EmployeeSalary();
        System.out.println(empSalObj2);
        System.out.println("The monthly salary of the Employee is: $"+empSalObj2.calcMonthlySalary());
        System.out.println("The monthly insurance of the Employee is: $"+empSalObj2.calcMonthlyInsurance());
        System.out.println("The monthly pf of the Employee is: $"+empSalObj2.calcMonthlyPfAmount());
        System.out.println("The annual gross salary of the Employee is: $"+empSalObj2.calcAnnualGrossSalary(bonus));
        System.out.println("The gross annual net pay of the Employee is: $"+empSalObj2.calcAnnualNetPay(bonus));
        empSalObj2.setHourlyRate(35.0);
        empSalObj2.setInsuranceRate(12.50);
        empSalObj2.setTaxRate(11.45);
        empSalObj2.setPfRate(10.5);
        System.out.print("Enter the new bonus of the Employee: ");
        bonus = scan.nextDouble();
        System.out.println("The details of empSalObj2 object are as follows:");
        System.out.println(empSalObj2);
         System.out.println("The monthly salary of the Employee is: $"+empSalObj2.calcMonthlySalary());
        System.out.println("The monthly insurance of the Employee is: $"+empSalObj2.calcMonthlyInsurance());
        System.out.println("The monthly pf of the Employee is: $"+empSalObj2.calcMonthlyPfAmount());
        System.out.println("The annual gross salary of the Employee is: $"+empSalObj2.calcAnnualGrossSalary(bonus));
        System.out.println("The gross annual net pay of the Employee is: $"+empSalObj2.calcAnnualNetPay(bonus));
        
        
        
    }
    
}
