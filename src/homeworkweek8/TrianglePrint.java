package homeworkweek8;

import java.util.Scanner;

public class TrianglePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int numberofRows = sc.nextInt();
        triangle(numberofRows);


    }

    public static void triangle(int a) {

        for (int i = 1; i <=a; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();


        }

    }


}
