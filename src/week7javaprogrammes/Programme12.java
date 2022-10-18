package week7javaprogrammes;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol
public class Programme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character or number or Symbol: ");
        char  ch = scanner.next().charAt(0);

        verificationOfInput(ch);
    }

    //using character class
     public static void verificationOfInput(char input) {
        if (Character.isAlphabetic(input)) {
            System.out.println(input + " is a Alphabet.");
        } else if (Character.isDigit(input)) {
            System.out.println(input + " is a Digit.");
        } else if (!Character.isAlphabetic(input)||!Character.isDigit(input)) {
            System.out.println(input + " is a Symbol");
        }else {
            System.out.println("Something new");
        }

    }


}





