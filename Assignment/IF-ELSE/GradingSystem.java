//Question 5 -  A school has following grade system
//              - Below 25 - F
//              - 25 to 45 - E
//              - 45 to 50 - D
//              - 50 to 60 - C
//              - 60 to 80 - B
//              - Above 80 - A
//              Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks:- ");
        int marks  = sc.nextInt();

        sc.close();

        if(marks < 25){
            
            System.out.println("F");
        }
        else if(marks >= 25 && marks < 45){
            
            System.out.println("Grade :- E");
        }
        else if(marks > 45 && marks <50){
            
            System.out.println("Grade :- D");
        }
        else if(marks >= 50 && marks<60){
            
            System.out.println("Grade :- C");
        }
        else if(marks >= 60 && marks<80){
            
            System.out.println("Grade :- B");
        }
        else{
            
            System.out.println("Grade :- A");
        }
    }
}
