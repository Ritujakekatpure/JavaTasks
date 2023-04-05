import java.util.Scanner;
import java.util.ArrayList;

public class ListMenu {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        int choice;
        System.out.println("----Menu----");
        do {
            System.out.println("Enter 1: Add");
            System.out.println("Enter 2: Remove");
            System.out.println("Enter 3: Display");
            System.out.println("Enter 4: Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the element to add");
                    Integer a = sc.nextInt();
                    numbers.add(a);
                    break;
                }
                case 2: {
                    System.out.print("Enter element to remove");
                    Integer r = sc.nextInt();
                    boolean check = numbers.remove(r);
                    if (check) {
                        System.out.println("element is removed");
                    } else {
                        System.out.println("element not found");
                    }
                    break;
                }
                case 3: {
                    System.out.print("elements in list " + numbers);
                    break;
                }
                default: {
                    System.out.println("Exiting the program");
                    return;
                }
            }
        } while (choice < 4 && choice >= 0);
    }

}
