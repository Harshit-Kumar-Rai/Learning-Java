//Question 6 - Take input of age 3 pepole by user and determine oldest and youngest among them
import java.util.Scanner;
public class OldestAndYoungest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Person Age:- ");
        int person_1 = sc.nextInt();

        System.out.print("Enter Second Person Age:- ");
        int person_2 = sc.nextInt();

        System.out.print("Enter Third Person Age:- ");
        int person_3 = sc.nextInt();

        sc.close();

        if (person_1 > person_2 && person_1 > person_3) {
            
            System.out.println("Olddest "+person_1);
            
        }else if(person_2 > person_1 && person_2 > person_3){
            
            System.out.println("Oldest:- "+person_2);
        } else {
            
            System.out.println("Oldest:- "+person_3);
        }
        
        if (person_1 < person_2 && person_1 < person_3) {
            
            System.out.println("Youngest:- "+person_1);
            
        }else if(person_2 < person_1 && person_2 < person_3){
            
            System.out.println("Youngest:- "+person_2);
        } else {
            
            System.out.println("Youngest:- "+person_3);
        }

    }

}

