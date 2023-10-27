package day04_practice;

public class SalaryCalculator {

    public static void main(String[] arg) {

        String name = "Jose Antonio";
        int hourlyRate = 50;
        int weeklyHours = 40;

        int salary = (hourlyRate * weeklyHours + 52);
        System.out.println("Hello " + name + ", your salary is $" +salary);

    }

}
