// Question 7 - Write a program to print absolute value of a number entered by user

import java.util.Scanner;;
public class Absolute {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value:- ");
        int value = sc.nextInt();
        
        sc.close();

        if(value >= 0){
            System.out.println("Absolute value is:- "+value);
        } else{

            System.out.println("Absolute Value is:- "+(value * -1));
        }
        
    }
}
