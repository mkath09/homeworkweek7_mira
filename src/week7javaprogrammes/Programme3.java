package week7javaprogrammes;
/*
3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________
 */

import java.util.Scanner;

public class Programme3 {
    static String name , result, grade;
    static int Rollno,Maths,Science,English,Total;
    static float percentage;
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        marksheet();
    }
        public static void studentDetails(){
            System.out.println("Enter student name ");
            name = scanner.nextLine();
            System.out.println("Enter roll no: ");
           Rollno=scanner.nextInt();
        }
        public static void subjectMarks() {
            System.out.println("Enter Maths marks:  ");
            Maths = scanner.nextInt();
            if (Maths > 100) {
                System.out.println("invalid marks! Enter marks between 0 and 100");
                System.out.println("Enter Maths marks:  ");
                Maths = scanner.nextInt();

            }
            System.out.println("Enter Science marks:  ");
            Science = scanner.nextInt();
            if (Maths > 100) {
                System.out.println("invalid marks! Enter marks between 0 and 100");
                System.out.println("Enter Science marks:  ");
                Science = scanner.nextInt();
            }
            System.out.println("Enter English marks:  ");
            English = scanner.nextInt();
            if (English > 100) {
                System.out.println("invalid marks! Enter marks between 0 and 100");
                System.out.println("Enter English marks:  ");
                English = scanner.nextInt();
            }
        }
        public static void calculation(){
        subjectMarks();
        Total=Maths+Science+English;
        percentage=Total/3f;

        result=percentage>=35?"PASS":"FAIL";

        if (Maths>=35&& Science>=35&&English>=35&&percentage>=35){
            result="PASS";
        }else {
            result="FAIL";
        }
        if (percentage>=80){
            grade="A+";
        } else if (percentage>=60) {
            grade="A";
        } else if (percentage>=50) {
            grade="B";
        } else if (percentage>=35) {
            grade="C";
        }else {
            grade="D";
        }
        }
        public static void marksheet(){
        studentDetails();
        calculation();
            System.out.println(" ");
            System.out.println("|-------------------|");
            System.out.println("|    Mark Sheet     |");
            System.out.println("|-------------------|");
            System.out.println("|Name: " +   name +"       |");
            System.out.println("|-------------------|");
            System.out.println("|RollNO: "+    Rollno+"    |");
            System.out.println("|-------------------|");
            System.out.println("|Subjects:"  +"      |");
            System.out.println("|-------------------|");
            System.out.println("|Math:  +     Maths      |");
            System.out.println("|Science:" +   Science + "    |");
            System.out.println("|English: +  English       |");
            System.out.println("|-------------------|");
            System.out.println("|Total: "+        Total+"   |");
            System.out.println("|-------------------|");
            System.out.println("|Percentage:"+"    ");
            System.out.println("|Result:"+ result+ "          |");
            System.out.println("|Grade:"+ grade+ "           |");
            System.out.println("|-------------------|");
        }
}
