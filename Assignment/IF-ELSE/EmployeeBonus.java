// A company decide to give a bonus of 5% to employee if his/her  year of serice is more than 5 years
//  - ask user for their salary and year of service and print net bonus amount
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Salary:- ");
        int salary = sc.nextInt();

        System.out.print("Enter Year of Service:- ");
        int year = sc.nextInt();

        sc.close();
        
        if(year <= 5){

            System.out.println("Total Bonus Amount:- "+0.00);
            System.out.println("Net Salary:- "+salary);
            
        }else{

            int bonus = (int)(salary * 0.05);

            System.out.println("Total Salary:- "+salary);
            System.out.println("Bonus Amount:- "+bonus);
            System.out.println("Net Salary :- "+(salary+bonus));
        }
    }
}
