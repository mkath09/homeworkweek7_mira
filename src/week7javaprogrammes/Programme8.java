package week7javaprogrammes;

import java.util.Scanner;

/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
public class Programme8 {

    static char city;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter between A to F:");
       char city = scanner.next().charAt(0);
       cityName(city);

    }

   public static void cityName(char city) {

       if (city == 'a' || city == 'A') {
           System.out.println("Amstadam");
       } else if (city == 'b' || city == 'B') {
           System.out.println("Baroda");
       } else if (city == 'c' || city == 'C') {
           System.out.println("Chanshad");
       } else if (city == 'd' || city == 'D') {
           System.out.println("dolatabad");
       } else if (city == 'e' || city == 'E') {
           System.out.println("Edinburgh");
       } else if (city == 'f' || city == 'F') {
           System.out.println("Faridabad");
       } else {
           System.out.println("invalid name");
       }

   }
}











