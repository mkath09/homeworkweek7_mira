package week7javaprogrammes;

import java.util.Scanner;

/*
Same as above program-8 using switch statement.
 */
public class Programme9 {
    public static void main(String[] args) {

        cityName();
    }
    public static void cityName(){
        Scanner scanner =new Scanner(System.in);
        char city = scanner.next().charAt(0);
        switch (city){
            case 'a':
                System.out.println("Ahmdabad");
                break;
            case 'b':
                System.out.println("Baroda");
                break;
            case 'c':
                System.out.println("chanshad");
                break;
            case 'd':
                System.out.println("Dadar");
                break;
            case 'e':
                System.out.println("East london");
                break;
            case 'f':
                System.out.println("France");
                break;
            default:
                    System.out.println("Invalid entry");
        }

    }
}
