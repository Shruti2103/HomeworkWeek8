package homeworkweek8;

import java.util.Scanner;

/*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153 */
public class Programe10 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int armnumber = sc.nextInt();
        Programe10 obj = new Programe10();
        System.out.println(obj.armStrong(armnumber));
    }

    public String armStrong(int number) {
        double sum = 0;
        int digit = 0;
        int last = 0;
        String msg;

        int temp = number;
        while (temp > 0) {
            temp = temp / 10;
            digit++;

        }
        temp = number;
        while (temp > 0) {
            last = temp % 10; //finding last digit
            sum = sum + (Math.pow(last, digit));// formula for Armstrong number
            temp = temp / 10;// removing last digit
        }
        if (number == sum) {
            msg = "given number is Armstrong Number";
        } else
            msg = "given number is not Armstrong Number";
        return msg;

    }


}



