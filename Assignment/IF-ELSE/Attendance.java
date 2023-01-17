//Question 8 - A Student willnot be allowed to sit in exam if his/her attendance is less than 75%, Take following input from user
//           - Number of classes held
//           - Number of classes attended  
//           - and print perctange of class attended 
//           - is student is allowed to in exam or not

import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Classes  Held:- ");
        int classes = sc.nextInt();

        System.out.print("Number of Classes Attended:- ");
        int attended = sc.nextInt();
        
        sc.close();

        int percentage = (attended * 100 / classes);
        if (percentage >= 75) {

            System.out.println("You are Allowed to Take exam...");
            
        }else{
            System.out.println("You are not allowed to take exam..");
        }
    }
}
