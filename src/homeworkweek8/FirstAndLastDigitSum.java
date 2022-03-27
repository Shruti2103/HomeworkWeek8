package homeworkweek8;

import java.util.Scanner;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println(sumFirstAndLastDigit(num));


    }

    public static int sumFirstAndLastDigit(int number) {

        int First_Digit = 0;
        int Last_Digit = number % 10;
        int sum = 0;

        while (number != 0) {
            int a = number % 10;
            sum = a;
            number = number / 10;
        }

        return Last_Digit + sum;


    }


}
