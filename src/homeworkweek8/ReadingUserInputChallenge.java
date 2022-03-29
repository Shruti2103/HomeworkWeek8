package homeworkweek8;
/*Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the
count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number
#2:, and so on. */
import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.numberSum();

    }

    // A method to check and calculate the sum of the valid integer numbers
    public void numberSum() {


        int count = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        // to check sum of all numbers while loop
        while (count <= 10) {
            System.out.println("Enter number #" + count);

            boolean validNumber = sc.hasNextInt();
            if (validNumber) {
                int number = sc.nextInt();
                sum = sum + number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine();
        }
        System.out.println("sum of all numbers =" + sum);
    }


}





