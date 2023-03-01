import java.util.Scanner;

public class Convertor
{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1 for Rupee to Dollar conversion ");
        System.out.println("Enter 2 for Dollar to Rupee conversion ");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.print("Enter rupee amount: ");
            double r1 = sc.nextDouble();
            double d1 = r1 / 77;
            System.out.println(r1 + " rupees " + d1 + " dollars");
            break;
            
            case 2:
            System.out.print("Enter dollar amount: ");
            double d2 = sc.nextDouble();
            double r2 = d2 * 77;
            System.out.println(d2 + " dollars " + r2 + " rupees");
            break;
            
            default:
            System.out.println("Invalid Choice");
        }
    }
}

