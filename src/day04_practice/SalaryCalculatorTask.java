package day04_practice;

public class SalaryCalculatorTask {

    public static void main(String[] arg) {

        int hourlyRate = 50;
            weeklyHours = 45;
            stateTaxRate = 6;
            federalTaxRate = 26;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52,
            stateTax        = salaryBeforeTax * stateTaxRate / 100,
            federalTax      = salaryBeforeTax * federalTaxRate / 100,
            totalTax        = stateTax + federalTax,
            salaryAfterTax  = salaryBeforeTax - totalTax;

        System.out.println(" Gross pay is: $" + salaryAfterTax);
        System.out.println(" Federal tax is: $" + federalTax);
        System.out.println(" State tax is: $" + stateTax);
        System.out.println(" Total tax is: $" + totalTax);
        System.out.println(" Net income is: $" + salaryAfterTax);
        System.out.println("_____________" + weeklyHours );4


    }
}
