package homeworkweek8;

import java.util.Locale;
import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
        error message.*/
public class Programe3 {
    public static void main(String[] args) {
        Programe3 programe3=new Programe3();
        programe3.VowelCheck();

    }

    public void VowelCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphbet");
        String s = sc.nextLine();
        String s1 = s.toLowerCase(Locale.ROOT);
        char ch = s1.charAt(0);
        boolean flag = Character.isAlphabetic(ch);
        if (s1.length() == 1 && flag) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + "is vowel");
        else
            System.out.println(ch + "is consonant");
        } else
            System.out.println("invalid Input");


    }
}