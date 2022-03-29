package homeworkweek8;
/*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.*/
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
            int a = number % 10;//to get last digit from user input
            sum = a;
            number = number / 10;// to get first digit from user input
        }

        return Last_Digit + sum;


    }


}
