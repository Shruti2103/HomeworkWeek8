package homeworkweek8;

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





