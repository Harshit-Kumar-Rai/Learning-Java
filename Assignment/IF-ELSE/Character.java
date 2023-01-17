// Question 11 - Write a program to check whether entered character is lowercase(a to z) or uppercase(A to Z)

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Character:- ");
        char ch = sc.next().charAt(0);

        sc.close();
        
        if((int)ch >= 97 && (int)ch <= 122){

            System.out.println("Lowercase Character..");

        }else{

            System.out.println("Uppercase Character..");
        }
    }
}
