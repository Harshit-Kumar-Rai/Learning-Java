// Question 12 Write a program to check if a year is leap year are not 

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Year:- ");
        int year = sc.nextInt();

        sc.close();

        if(year % 400 == 0){
            System.out.println("Leap year..");
        }

        else if (year % 100 == 0){
            System.out.println("Not A Leap Year..");
        }

        else if(year % 4 == 0){
            System.out.println("Leap Year..");
        }
        else {
            System.out.println("Not A Leap Year..");
        }

    }
}
