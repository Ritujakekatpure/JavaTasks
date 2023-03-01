import java.util.Scanner;  
public class Largest  
{  
public static void main(String[] args)   
{  
int num1, num2, num3, largest, temp; 
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number:");  
num1 = sc.nextInt();  
System.out.println("Enter the second number:");  
num2 = sc.nextInt();  
System.out.println("Enter the third number:");  
num3 = sc.nextInt();  
temp=num1>num2?num1:num2;  
largest=num3>temp?num3:temp;    
System.out.println("The largest number is: "+largest);  
}  
}  