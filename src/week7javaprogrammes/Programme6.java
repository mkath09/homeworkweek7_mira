package week7javaprogrammes;
import java.util.Scanner;
//6. Write a java program to input any number and find out if it’s odd or even
public class Programme6 {
    public static void main(String[] args) {

        Programme6 obj = new Programme6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();
        obj.evenOddNumber(number
        );
    }
    //This method is for odd or even number
    public void evenOddNumber(int number) {
        //checking number whether the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Enter a any number is even");
        } else {
            System.out.println("Enter a any number is odd");
        }
    }
}
