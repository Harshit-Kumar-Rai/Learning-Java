//1 Question:- Take values of length and breadth of a rectangel from user and check if it is sqare or not.
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Length:- ");
        int length  = sc.nextInt();

        System.out.print("Enter the Breadth:- ");
        int breadth = sc.nextInt();
        
        sc.close();

        if(length == breadth){
            System.out.println("!! Number is Square !!");
        }else{
            System.out.println("!! Number is not square !!");
        }
    }
}
