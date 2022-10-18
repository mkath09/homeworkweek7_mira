package week7javaprogrammes;

import java.util.Scanner;

/*
5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
 */
public class Programme5 {
    static int employeeId,basicsalary;
    static String name;
    static float hra,da,ta,pf,grosssalary;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
      infolmput();


    }
    public static void infolmput(){
        System.out.println("Enter employee name:");
        name= scanner.nextLine();
        System.out.println("Enter employee id:");
        employeeId= scanner.nextInt();
        System.out.println("Enter employee's basic salary:");
        basicsalary= scanner.nextInt();
        hra=(basicsalary*10)/100f;
        da=(basicsalary*8)/100f;
        ta=(basicsalary*9)/100f;
        pf=(basicsalary*20)/100f;

        grosssalary=(basicsalary+hra+ta+da)-pf;
        System.out.println("|Employee Id:"+employeeId+" |");
        System.out.println("|Employee Name:"+name+"name"+" |");
        System.out.println("|--------------|");
        System.out.println("|Basic Salary:" + basicsalary+" |");
        System.out.println("|HRA 10%:"+hra+"  |");
        System.out.println("TA 8%:"+ta+" |");
        System.out.println("|PF(-20%):"+pf+" |");
        System.out.println("|-----------|");
        System.out.println("|Gross Salary:"+grosssalary+" |");
    }
}

