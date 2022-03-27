package homeworkweek8;

import java.util.Scanner;

public class EvenDigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int x = sc.nextInt();
     if(getEvenDigitSum(x)!=-1){
         System.out.println("The sum of even digits of the given number "+x + ")is: " +getEvenDigitSum(x));
     }else {
         System.out.println("invalid input" + getEvenDigitSum(x));
     }

    }

    public static int getEvenDigitSum(int number) {
        int lastdigit;
        int sum = 0;
        if (number > 0) {
            while (number > 0) {
                lastdigit = number % 10;//seprating last digit
                if (lastdigit % 2 == 0) {     //check if last digit is even or not,if it is even then add else ignore it

                    sum = sum + lastdigit;

                }

                number = number / 10;
            }
        } else
            sum = -1;
        return sum;

    }


}











