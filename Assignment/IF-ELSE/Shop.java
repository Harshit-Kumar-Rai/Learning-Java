// Question 3 . A shop will give discount of 10% if the cost of purchase quntity is more than 1000
//      - Ask user for quntity
//      - one unit cost will 100
//      - Judge and  print total cost of user

import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Quantity:- ");
        int quantity = sc.nextInt();
        sc.close();

        if(quantity <= 10){
            System.out.println("Total amount to be paid:- "+"Rs "+quantity*100);
        }else{
            float total_amount  = quantity * 100;
            float discount = (int)(total_amount * 0.10);

            System.out.println("Total amount to be paid :- "+"Rs "+(total_amount - discount));
            System.out.println("Total discount amount:- "+"Rs " +discount);
        }

    }
}
