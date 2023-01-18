// Write a program to calculate bike rent for first 5 km price 500 next 5km  price 400 rest of price 200
import java.util.Scanner;
public class MoBike {
    String bno;
    String name;
    int days;
    int charge;

    void input(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bike No:- ");
        String bike_no = sc.next();

        System.out.print("Enter Name:- ");
        String cu_name = sc.next();

        System.out.print("Enter Days:- ");
        int r_days = sc.nextInt();

        sc.close();
        bno = bike_no;
        name = cu_name;
        days = r_days;
    }
    void compute(){
        if (days >= 1 && days <=5){
            charge = days * 500;

        }else if(days > 5 && days <= 10){
            
            int value = days;
            int x = days - 5;
            value = value - x;
            charge = (days * 500) + (x * 400);
            
        } else{
            int value = days;
            value = value - 10;
            charge = (value * 200) + (4500);
        }
        
    }
    void display(){
        System.out.print("Bike No"+"    "+"  Name"+"  "+"     Days"+"  Amount");
        System.out.println(" ");
        System.out.print(bno+"  ");
        System.out.print(name+"     ");
        System.out.print(days+"     "); 
        System.out.print(charge+"    ");
    }
    public static void main(String[] args) {
        MoBike cu = new MoBike();
        cu.input();
        cu.compute();
        cu.display();

    }
}
