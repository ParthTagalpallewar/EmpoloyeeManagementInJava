import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("\n\n---------- WELCOME TO EMPLOYEE MANAGEMENT SYSTEM ----------\n\n");
        do {
            System.out.println("================================================");
            System.out.println("\t\t[0] EXIT");
            System.out.println("\t\t[1] ADD EMPLOYEE");
            System.out.println("\t\t[2] UPDATE EMPLOYEE DETAILS");
            System.out.println("\t\t[3] DELETE EMPLOYEE");
            System.out.println("\t\t[4] SHOW EMPLOYEE DETAILS");
            System.out.println("\t\t[5] SHOW LIST OF EMPLOYEE");
            System.out.print("\t\tEnter your choice: ");
            choice = sc.nextInt();

        } while (EmployeeOperations.actions(choice));

        sc.close();
    }
}