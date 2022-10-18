package week7javaprogrammes;

import java.util.Scanner;

/*
2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
public class Programme2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the year");
        int year =scanner.nextInt();
        boolean a = (year % 4) ==0;
        boolean b = (year % 100) ==0;
        boolean c = ((year % 100==0) && (year % 200 == 0));

        if (a &&(b||c))
        {
            System.out.println(year + "is a leap year");
        }else{
            System.out.println(year + "is not a leap year");
        }
    }
}
