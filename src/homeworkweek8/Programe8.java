package homeworkweek8;

import java.util.Scanner;

public class Programe8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numner of rows");
        int noOfRaws = sc.nextInt();
        triangle(noOfRaws);


    }

    public static void triangle(int a) {
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }


    }


}
