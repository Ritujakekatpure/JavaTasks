import java.io.*;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        EmployeeData ed = new EmployeeData();
        BufferedWriter writer = null;

        while (true) {
            try {
                writer = new BufferedWriter(new FileWriter("employee.txt", true));

            } catch (IOException e) {
                System.out.println(e);
            }


            System.out.print("Enter employee Name =");
            ed.setName(sc.nextLine());
           
            System.out.print("Enter EmpID = ");
            ed.setId(sc.next());
          

            System.out.print("Enter Designation = ");
            ed.setDesignation(sc.next());

            System.out.print("Enter Salary = ");
            ed.setSalary(sc.nextDouble());

            writer.write(ed.toString() + "\n \n");
            writer.close();
            System.out.println("\n" + ed + "\n");

        }

}
}