// 2. Take two int values from user and print greatest among them
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number:- ");
        int num_1 = sc.nextInt();

        System.out.print("Enter second Number:- ");
        int num_2 = sc.nextInt();

        if(num_1 > num_2){
            System.out.println(num_1+" Number is greater than second..");
        }else{
            System.out.println(num_2+" number greater thant first..");
        }
        sc.close();
    }
}
