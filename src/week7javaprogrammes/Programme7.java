package week7javaprogrammes;

import java.util.Scanner;

/*
. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
public class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount");
        double amount = scanner.nextDouble();
        System.out.println("Enter commissionPercentage");
           double commissionPercentage = scanner.nextDouble();
         double commission=(commissionPercentage/100)*amount;
        System.out.println("commission amount= "+commission);
    }
}
