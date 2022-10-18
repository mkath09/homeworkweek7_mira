package week7javaprogrammes;

import java.util.Scanner;
/*
 Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 */
public class Programme16 {

    public static void main(String[] args) {
        identifyNumber();

    }
    //This method is for to check if entered number is "POSITIVE","NEGATIVE" or "ZERO"
     public static void identifyNumber() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the number you want to check ");
         int number = scanner.nextInt();

         if (number > 0) {
             System.out.println(number + " is a positive number");
         } else if (number < 0) {
             System.out.println(number + " is a negative number");
         } else if(number==0){
             System.out.println(number + " is zero");
         }else {
             System.out.println("Invalid input. Please try again with any number");
         }
         scanner.close();

     }

    }

