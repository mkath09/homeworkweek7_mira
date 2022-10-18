package week7javaprogrammes;
/*
Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {
    public static void main(String[] args) {
    average();
    }
    public static void average(){
        int [] arr = new int[]{10,20,30,40,50};
        int sum=0;
        for (int i=0; i<arr. length; i++)
            sum = sum+arr[i];
        //calculate average value
        double average = sum/ arr.length;
        System.out.println("Average value is : +average");
    }

    }

