package homeworkweek8;

import java.util.Scanner;
/*-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number. */


public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        MinAndMaxInputChallenge.number();

    }

    public static void number() {
        // Minimum And Maximum

        Scanner input = new Scanner(System.in);
        int count = 0;
        int min = 0;
        int max = 0;
        boolean result = true;
        while (true) {
            int b = count++;
            System.out.println("Enter Number" + (b + 1) + ":");
            boolean isvalid = input.hasNextInt();
            if (isvalid) {
                int num = input.nextInt();

                if (result) {
                    result = false;
                    min = num;
                    max = num;
                }
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            } else {
                System.out.println("Invalid input...");
                break;
            }
            input.nextLine();
        }

        System.out.println("min Number: " + min);
        System.out.println("Max Number : " + max);


    }
}