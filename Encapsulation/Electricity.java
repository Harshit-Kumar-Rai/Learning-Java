package Encapsulation;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {

        int bill = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Units:- ");
        int unit  = input.nextInt();
        input.close();
        
        if (unit > 0 && unit <=200) {
            bill = 0;
        }
        else if(unit>200 && unit<=500){
            unit = unit - 200;
            bill = unit * 4;
        }
        else{
            unit = unit - 200;
            bill = unit * 6;
            int less_price = 300 * 4;
            bill = bill - less_price;
        }
        System.out.println("Total amount to be paid :- "+bill);
        
    }
}
