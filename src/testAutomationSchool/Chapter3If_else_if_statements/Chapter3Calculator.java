package testAutomationSchool.Chapter3If_else_if_statements;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class Chapter3Calculator {
    public static void main(String[] args) {
        //Initialize values we known
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - output
        if (sales >= quota){
            System.out.println("Congrats! You've met your quota!");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You didn't make your quota. You were " + salesShort + " sales short!");
        }
    }
}
