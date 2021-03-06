package testAutomationSchool.Chapter3If_else_if_statements;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class Chapter3Loan {
    public static void main(String[] args) {
        //Initialize values we known
        int salary = 30000;
        int years = 2;

        //Get what we don't
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double currentSalary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double currentYear = scanner.nextDouble();
        scanner.close();

        //Make decision
        if (currentSalary >= salary){
            if (currentYear >= years){
                System.out.println("Congrats! You qualify for the loan");
            }
            else {
                System.out.println("Sorry, you mut have worked at your current job " + years + " years.");
            }
        }
        else {
            System.out.println("Sorry, you must earn salary more then 30000$!");
        }
    }
}
