package week7javaprogrammes;

import java.util.Arrays;

// Write a Java program to sort a numeric array and a string array.
public class Programme17 {
    public static void main(String[] args) {
     numeric();
    }
    public static void numeric(){
        int[]num={1,5,7,8};
        String[]strings={"Mira","Zeel","Janaki","Sarika"};

        Arrays.toString(num);
        Arrays.toString(strings);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(strings));

        Arrays.sort(num);
        Arrays.sort(strings);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(strings));
    }
}
