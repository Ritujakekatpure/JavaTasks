import java.util.Scanner;
public class average {

 public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2=sc.nextDouble();
        System.out.print("Enter the third number: ");
        double num3=sc.nextDouble();
       
        System.out.print("The average of numbers is:" + (num1+num2+num3) / 3 );
    }
 
}